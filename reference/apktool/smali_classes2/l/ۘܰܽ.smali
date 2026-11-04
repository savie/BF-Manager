.class public Ll/ۘܰܽ;
.super Ljava/lang/Object;
.source "2B08"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ֡:I

.field public ֨:[I

.field public ۖ:I

.field public ۙۙ:I

.field public ۜ:I

.field public ۟:I

.field public ۠:J

.field public ۡ:[Ljava/lang/String;

.field public ۢ:I

.field public ۤۙ:[I

.field public ۬:Ljava/lang/String;

.field public final ܰ:[C

.field public final ܿ:Ljava/io/StringReader;

.field public ᩳ:I

.field public ᩴۙ:Ll/ᩴۨܽ;

.field public ᩶:J

.field public ᩷ۙ:Z

.field public ᩸ۙ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1993
    new-instance v0, Ll/᩺ܰܽ;

    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1993
    sput-object v0, Ll/ۢۨܽ;->ۙ:Ll/ۢۨܽ;

    return-void
.end method

.method public constructor <init>(Ljava/io/StringReader;)V
    .locals 4

    .line 323
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 253
    sget-object v0, Ll/ᩴۨܽ;->᩶:Ll/ᩴۨܽ;

    iput-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    const/16 v0, 0xff

    .line 257
    iput v0, p0, Ll/ۘܰܽ;->ۢ:I

    const/16 v0, 0x400

    new-array v0, v0, [C

    .line 266
    iput-object v0, p0, Ll/ۘܰܽ;->ܰ:[C

    const/4 v0, 0x0

    .line 268
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 269
    iput v0, p0, Ll/ۘܰܽ;->֡:I

    const-wide/16 v1, 0x0

    .line 271
    iput-wide v1, p0, Ll/ۘܰܽ;->᩶:J

    .line 273
    iput v0, p0, Ll/ۘܰܽ;->۟:I

    .line 274
    iput v0, p0, Ll/ۘܰܽ;->ᩳ:I

    .line 276
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    const/16 v1, 0x20

    new-array v2, v1, [I

    .line 297
    iput-object v2, p0, Ll/ۘܰܽ;->ۤۙ:[I

    const/4 v3, 0x1

    .line 302
    iput v3, p0, Ll/ۘܰܽ;->᩸ۙ:I

    const/4 v3, 0x6

    aput v3, v2, v0

    new-array v0, v1, [Ljava/lang/String;

    .line 313
    iput-object v0, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    new-array v0, v1, [I

    .line 314
    iput-object v0, p0, Ll/ۘܰܽ;->֨:[I

    .line 324
    iput-object p1, p0, Ll/ۘܰܽ;->ܿ:Ljava/io/StringReader;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۘܰܽ;)Ljava/lang/IllegalStateException;
    .locals 1

    const-string v0, "a name"

    .line 212
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Z)Ljava/lang/String;
    .locals 4

    .line 1786
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 1787
    :goto_0
    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    if-ge v1, v2, :cond_2

    .line 1788
    iget-object v3, p0, Ll/ۘܰܽ;->ۤۙ:[I

    aget v3, v3, v1

    packed-switch v3, :pswitch_data_0

    .line 1812
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Unknown scope value: "

    .line 0
    invoke-static {v3, v0}, Ll/۬ۚ᩸;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1812
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    const/16 v2, 0x2e

    .line 1802
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1803
    iget-object v2, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    aget-object v2, v2, v1

    if-eqz v2, :cond_1

    .line 1804
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 1792
    :pswitch_1
    iget-object v3, p0, Ll/ۘܰܽ;->֨:[I

    aget v3, v3, v1

    if-eqz p1, :cond_0

    if-lez v3, :cond_0

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_0

    add-int/lit8 v3, v3, -0x1

    :cond_0
    const/16 v2, 0x5b

    .line 1797
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_1
    :goto_1
    :pswitch_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1815
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method private ۙ(Ljava/lang/String;)V
    .locals 2

    .line 984
    iget-boolean v0, p0, Ll/ۘܰܽ;->᩷ۙ:Z

    if-eqz v0, :cond_0

    .line 985
    iget-object v0, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v1, -0x1

    aput-object p1, v0, v1

    const/4 p1, 0x0

    .line 986
    iput-boolean p1, p0, Ll/ۘܰܽ;->᩷ۙ:Z

    :cond_0
    return-void
.end method

.method private ۙ(C)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    .line 935
    :cond_0
    :pswitch_0
    invoke-direct {p0}, Ll/ۘܰܽ;->ۜ()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ۙ(I)Z
    .locals 9

    .line 1606
    iget v0, p0, Ll/ۘܰܽ;->ᩳ:I

    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v0, v1

    iput v0, p0, Ll/ۘܰܽ;->ᩳ:I

    .line 1607
    iget-wide v2, p0, Ll/ۘܰܽ;->᩶:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ۘܰܽ;->᩶:J

    .line 1608
    iget v0, p0, Ll/ۘܰܽ;->֡:I

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ۘܰܽ;->ܰ:[C

    if-eq v0, v1, :cond_0

    sub-int/2addr v0, v1

    .line 1609
    iput v0, p0, Ll/ۘܰܽ;->֡:I

    .line 1610
    invoke-static {v3, v1, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 1612
    :cond_0
    iput v2, p0, Ll/ۘܰܽ;->֡:I

    .line 1615
    :goto_0
    iput v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1617
    :cond_1
    iget v0, p0, Ll/ۘܰܽ;->֡:I

    array-length v1, v3

    sub-int/2addr v1, v0

    iget-object v4, p0, Ll/ۘܰܽ;->ܿ:Ljava/io/StringReader;

    invoke-virtual {v4, v3, v0, v1}, Ljava/io/Reader;->read([CII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 1618
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۘܰܽ;->֡:I

    .line 1621
    iget-wide v4, p0, Ll/ۘܰܽ;->᩶:J

    const-wide/16 v6, 0x0

    const/4 v0, 0x1

    cmp-long v8, v4, v6

    if-nez v8, :cond_2

    iget v4, p0, Ll/ۘܰܽ;->ۙۙ:I

    if-nez v4, :cond_2

    if-lez v1, :cond_2

    aget-char v5, v3, v2

    const v6, 0xfeff

    if-ne v5, v6, :cond_2

    add-int/lit8 v4, v4, 0x1

    .line 1622
    iput v4, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1623
    iget v4, p0, Ll/ۘܰܽ;->ᩳ:I

    add-int/2addr v4, v0

    iput v4, p0, Ll/ۘܰܽ;->ᩳ:I

    add-int/lit8 p1, p1, 0x1

    :cond_2
    if-lt v1, p1, :cond_1

    return v0

    :cond_3
    return v2
.end method

.method private ۜ()V
    .locals 2

    .line 1729
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v1, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"

    .line 1730
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private ۤ(C)Ljava/lang/String;
    .locals 11

    const/4 v0, 0x0

    move-object v1, v0

    .line 1214
    :goto_0
    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1215
    iget v3, p0, Ll/ۘܰܽ;->֡:I

    :goto_1
    move v4, v2

    :goto_2
    const/16 v5, 0x10

    const/4 v6, 0x1

    .line 1218
    iget-object v7, p0, Ll/ۘܰܽ;->ܰ:[C

    if-ge v4, v3, :cond_7

    add-int/lit8 v8, v4, 0x1

    .line 1219
    aget-char v4, v7, v4

    .line 1223
    iget-object v9, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v10, Ll/ᩴۨܽ;->֡:Ll/ᩴۨܽ;

    if-ne v9, v10, :cond_1

    const/16 v9, 0x20

    if-lt v4, v9, :cond_0

    goto :goto_3

    :cond_0
    const-string p1, "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"

    .line 1224
    invoke-direct {p0, p1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_3
    if-ne v4, p1, :cond_3

    .line 1227
    iput v8, p0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v8, v2

    sub-int/2addr v8, v6

    if-nez v1, :cond_2

    .line 1230
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v7, v2, v8}, Ljava/lang/String;-><init>([CII)V

    invoke-direct {p0, p1}, Ll/ۘܰܽ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1232
    :cond_2
    invoke-virtual {v1, v7, v2, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1233
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۘܰܽ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v9, 0x5c

    if-ne v4, v9, :cond_5

    .line 1236
    iput v8, p0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v8, v2

    add-int/lit8 v3, v8, -0x1

    if-nez v1, :cond_4

    mul-int/lit8 v8, v8, 0x2

    .line 1240
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v8, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1242
    :cond_4
    invoke-virtual {v1, v7, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1243
    invoke-direct {p0}, Ll/ۘܰܽ;->᩷ۙ()C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1244
    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1245
    iget v3, p0, Ll/ۘܰܽ;->֡:I

    goto :goto_1

    :cond_5
    const/16 v5, 0xa

    if-ne v4, v5, :cond_6

    .line 1248
    iget v4, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v4, v6

    iput v4, p0, Ll/ۘܰܽ;->۟:I

    .line 1249
    iput v8, p0, Ll/ۘܰܽ;->ᩳ:I

    :cond_6
    move v4, v8

    goto :goto_2

    :cond_7
    if-nez v1, :cond_8

    sub-int v1, v4, v2

    mul-int/lit8 v1, v1, 0x2

    .line 1255
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v1, v3

    :cond_8
    sub-int v3, v4, v2

    .line 1257
    invoke-virtual {v1, v7, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1258
    iput v4, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1259
    invoke-direct {p0, v6}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v2

    if-eqz v2, :cond_9

    goto/16 :goto_0

    :cond_9
    const-string p1, "Unterminated string"

    .line 1260
    invoke-direct {p0, p1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v0
.end method

.method private ۬()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    .line 1293
    :goto_0
    iget v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int v4, v3, v2

    iget v5, p0, Ll/ۘܰܽ;->֡:I

    iget-object v6, p0, Ll/ۘܰܽ;->ܰ:[C

    if-ge v4, v5, :cond_2

    add-int/2addr v3, v2

    .line 1294
    aget-char v3, v6, v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_3

    const/16 v4, 0x23

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    const/16 v4, 0x7b

    if-eq v3, v4, :cond_3

    const/16 v4, 0x7d

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_1

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1300
    :cond_1
    :pswitch_0
    invoke-direct {p0}, Ll/ۘܰܽ;->ۜ()V

    goto :goto_1

    .line 1319
    :cond_2
    array-length v3, v6

    if-ge v2, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    .line 1320
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    :pswitch_1
    move v1, v2

    goto :goto_2

    :cond_4
    if-nez v0, :cond_5

    .line 1329
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 1331
    :cond_5
    iget v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    invoke-virtual {v0, v6, v3, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 1332
    iget v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v3, v2

    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    const/4 v2, 0x1

    .line 1334
    invoke-direct {p0, v2}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-nez v0, :cond_6

    .line 1340
    new-instance v0, Ljava/lang/String;

    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    invoke-direct {v0, v6, v2, v1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_3

    :cond_6
    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    invoke-virtual {v0, v6, v2, v1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1341
    :goto_3
    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ᩴ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1268
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v1, Ll/ᩴۨܽ;->֡:Ll/ᩴۨܽ;

    if-eq v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 1271
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 1272
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 1273
    invoke-static {v1}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1274
    invoke-static {v1}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    .line 1275
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1276
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "Unpaired surrogate characters are not allowed in strict mode"

    .line 1279
    invoke-direct {p0, p1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-object p1
.end method

.method private ᩴۙ()V
    .locals 4

    :cond_0
    const/4 v0, 0x0

    .line 1376
    :goto_0
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int v2, v1, v0

    iget v3, p0, Ll/ۘܰܽ;->֡:I

    if-ge v2, v3, :cond_3

    .line 1377
    iget-object v2, p0, Ll/ۘܰܽ;->ܰ:[C

    add-int/2addr v1, v0

    aget-char v1, v2, v1

    const/16 v2, 0x9

    if-eq v1, v2, :cond_2

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    const/16 v2, 0xc

    if-eq v1, v2, :cond_2

    const/16 v2, 0xd

    if-eq v1, v2, :cond_2

    const/16 v2, 0x20

    if-eq v1, v2, :cond_2

    const/16 v2, 0x23

    if-eq v1, v2, :cond_1

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_2

    const/16 v2, 0x2f

    if-eq v1, v2, :cond_1

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_1

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_2

    const/16 v2, 0x7d

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3b

    if-eq v1, v2, :cond_1

    packed-switch v1, :pswitch_data_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1383
    :cond_1
    :pswitch_0
    invoke-direct {p0}, Ll/ۘܰܽ;->ۜ()V

    .line 1395
    :cond_2
    :pswitch_1
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v0

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    return-void

    :cond_3
    add-int/2addr v1, v0

    .line 1401
    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    const/4 v0, 0x1

    .line 1402
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ᩷(Z)I
    .locals 9

    .line 1649
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1650
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    :goto_0
    const/4 v2, 0x1

    if-ne v0, v1, :cond_2

    .line 1653
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1654
    invoke-direct {p0, v2}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 1722
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "End of input"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1657
    :cond_1
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1658
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    :cond_2
    add-int/lit8 v3, v0, 0x1

    .line 1661
    iget-object v4, p0, Ll/ۘܰܽ;->ܰ:[C

    aget-char v5, v4, v0

    const/16 v6, 0xa

    if-ne v5, v6, :cond_3

    .line 1663
    iget v0, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۘܰܽ;->۟:I

    .line 1664
    iput v3, p0, Ll/ۘܰܽ;->ᩳ:I

    goto/16 :goto_6

    :cond_3
    const/16 v7, 0x20

    if-eq v5, v7, :cond_f

    const/16 v7, 0xd

    if-eq v5, v7, :cond_f

    const/16 v7, 0x9

    if-ne v5, v7, :cond_4

    goto/16 :goto_6

    :cond_4
    const/16 v7, 0x2f

    if-ne v5, v7, :cond_d

    .line 1671
    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    const/4 v8, 0x2

    if-ne v3, v1, :cond_5

    .line 1673
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1674
    invoke-direct {p0, v8}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    .line 1675
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    if-nez v0, :cond_5

    goto :goto_1

    .line 1681
    :cond_5
    invoke-direct {p0}, Ll/ۘܰܽ;->ۜ()V

    .line 1682
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    aget-char v1, v4, v0

    const/16 v3, 0x2a

    if-eq v1, v3, :cond_7

    if-eq v1, v7, :cond_6

    :goto_1
    return v5

    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 1696
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1697
    invoke-direct {p0}, Ll/ۘܰܽ;->᩸ۙ()V

    .line 1698
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1699
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    goto :goto_0

    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 1686
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1758
    :goto_2
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v0, v8

    iget v1, p0, Ll/ۘܰܽ;->֡:I

    if-le v0, v1, :cond_9

    invoke-direct {p0, v8}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string p1, "Unterminated comment"

    .line 1688
    invoke-direct {p0, p1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 1759
    :cond_9
    :goto_3
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    aget-char v1, v4, v0

    if-ne v1, v6, :cond_a

    .line 1760
    iget v1, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۘܰܽ;->۟:I

    add-int/lit8 v0, v0, 0x1

    .line 1761
    iput v0, p0, Ll/ۘܰܽ;->ᩳ:I

    goto :goto_5

    :cond_a
    const/4 v0, 0x0

    :goto_4
    if-ge v0, v8, :cond_c

    .line 1765
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v0

    aget-char v1, v4, v1

    const-string v3, "*/"

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_b

    .line 1758
    :goto_5
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    goto :goto_2

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 1690
    :cond_c
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v0, v8

    .line 1691
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    goto/16 :goto_0

    :cond_d
    const/16 v0, 0x23

    if-ne v5, v0, :cond_e

    .line 1706
    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1712
    invoke-direct {p0}, Ll/ۘܰܽ;->ۜ()V

    .line 1713
    invoke-direct {p0}, Ll/ۘܰܽ;->᩸ۙ()V

    .line 1714
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1715
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    goto/16 :goto_0

    .line 1717
    :cond_e
    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    return v5

    :cond_f
    :goto_6
    move v0, v3

    goto/16 :goto_0
.end method

.method private ᩷(I)V
    .locals 3

    .line 1586
    iget v0, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v0, -0x1

    iget v2, p0, Ll/ۘܰܽ;->ۢ:I

    if-ge v1, v2, :cond_1

    .line 1591
    iget-object v1, p0, Ll/ۘܰܽ;->ۤۙ:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    .line 1593
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۘܰܽ;->ۤۙ:[I

    .line 1594
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۘܰܽ;->֨:[I

    .line 1595
    iget-object v1, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    .line 1597
    :cond_0
    iget-object v0, p0, Ll/ۘܰܽ;->ۤۙ:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    aput p1, v0, v1

    return-void

    .line 1587
    :cond_1
    new-instance p1, Ll/ܿܰܽ;

    const-string v0, "Nesting limit "

    const-string v1, " reached"

    .line 0
    invoke-static {v2, v0, v1}, Ll/ۗ᩻ܺ;->ۙ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1588
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1588
    throw p1
.end method

.method private ᩷(Ljava/lang/String;)V
    .locals 3

    .line 1944
    new-instance v0, Ll/ܿܰܽ;

    .line 0
    invoke-static {p1}, Ll/ۤ۠֫;->ۙ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1945
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\nSee "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "malformed-json"

    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1945
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 1945
    throw v0
.end method

.method public static synthetic ᩷(Ll/ۘܰܽ;)V
    .locals 1

    const/4 v0, 0x1

    .line 212
    iput-boolean v0, p0, Ll/ۘܰܽ;->᩷ۙ:Z

    return-void
.end method

.method private ᩷ۙ()C
    .locals 9

    .line 1874
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v1, p0, Ll/ۘܰܽ;->֡:I

    const/4 v2, 0x0

    const-string v3, "Unterminated escape sequence"

    const/4 v4, 0x1

    if-ne v0, v1, :cond_1

    invoke-direct {p0, v4}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1875
    :cond_0
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2

    .line 1878
    :cond_1
    :goto_0
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget-object v5, p0, Ll/ۘܰܽ;->ܰ:[C

    aget-char v6, v5, v0

    const/16 v7, 0xa

    if-eq v6, v7, :cond_e

    const/16 v1, 0x22

    if-eq v6, v1, :cond_10

    const/16 v1, 0x27

    if-eq v6, v1, :cond_f

    const/16 v1, 0x2f

    if-eq v6, v1, :cond_10

    const/16 v1, 0x5c

    if-eq v6, v1, :cond_10

    const/16 v1, 0x62

    if-eq v6, v1, :cond_d

    const/16 v1, 0x66

    if-eq v6, v1, :cond_c

    const/16 v4, 0x6e

    if-eq v6, v4, :cond_b

    const/16 v4, 0x72

    if-eq v6, v4, :cond_a

    const/16 v4, 0x74

    if-eq v6, v4, :cond_9

    const/16 v4, 0x75

    if-ne v6, v4, :cond_8

    add-int/lit8 v0, v0, 0x5

    .line 1881
    iget v4, p0, Ll/ۘܰܽ;->֡:I

    const/4 v6, 0x4

    if-le v0, v4, :cond_3

    invoke-direct {p0, v6}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 1882
    :cond_2
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2

    .line 1886
    :cond_3
    :goto_1
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/lit8 v3, v0, 0x4

    const/4 v4, 0x0

    :goto_2
    if-ge v0, v3, :cond_7

    .line 1887
    aget-char v7, v5, v0

    shl-int/lit8 v4, v4, 0x4

    const/16 v8, 0x30

    if-lt v7, v8, :cond_4

    const/16 v8, 0x39

    if-gt v7, v8, :cond_4

    add-int/lit8 v7, v7, -0x30

    goto :goto_3

    :cond_4
    const/16 v8, 0x61

    if-lt v7, v8, :cond_5

    if-gt v7, v1, :cond_5

    add-int/lit8 v7, v7, -0x57

    goto :goto_3

    :cond_5
    const/16 v8, 0x41

    if-lt v7, v8, :cond_6

    const/16 v8, 0x46

    if-gt v7, v8, :cond_6

    add-int/lit8 v7, v7, -0x37

    :goto_3
    add-int/2addr v4, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 1896
    :cond_6
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    invoke-direct {v0, v5, v1, v6}, Ljava/lang/String;-><init>([CII)V

    const-string v1, "Malformed Unicode escape \\u"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2

    .line 1899
    :cond_7
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v0, v6

    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    int-to-char v0, v4

    return v0

    :cond_8
    const-string v0, "Invalid escape sequence"

    .line 1935
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2

    :cond_9
    const/16 v0, 0x9

    return v0

    :cond_a
    const/16 v0, 0xd

    return v0

    :cond_b
    return v7

    :cond_c
    const/16 v0, 0xc

    return v0

    :cond_d
    const/16 v0, 0x8

    return v0

    .line 1918
    :cond_e
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v3, Ll/ᩴۨܽ;->֡:Ll/ᩴۨܽ;

    if-eq v0, v3, :cond_12

    .line 1921
    iget v0, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v0, v4

    iput v0, p0, Ll/ۘܰܽ;->۟:I

    .line 1922
    iput v1, p0, Ll/ۘܰܽ;->ᩳ:I

    .line 1926
    :cond_f
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v1, Ll/ᩴۨܽ;->֡:Ll/ᩴۨܽ;

    if-eq v0, v1, :cond_11

    :cond_10
    return v6

    :cond_11
    const-string v0, "Invalid escaped character \"\'\" in strict mode"

    .line 1927
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2

    :cond_12
    const-string v0, "Cannot escape a newline character in strict mode"

    .line 1919
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v2
.end method

.method private ᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 4

    .line 1949
    invoke-virtual {p0}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v0

    .line 1951
    sget-object v1, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    if-ne v0, v1, :cond_0

    const-string v0, "adapter-not-null-safe"

    goto :goto_0

    :cond_0
    const-string v0, "unexpected-json-structure"

    .line 1952
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Expected "

    const-string v3, " but was "

    .line 0
    invoke-static {v2, p1, v3}, Ll/᩸ۨۧ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 1956
    invoke-virtual {p0}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1957
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\nSee "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 8
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1959
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method private ᩸(C)V
    .locals 5

    .line 1349
    :goto_0
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1350
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    :goto_1
    const/4 v2, 0x1

    if-ge v0, v1, :cond_3

    add-int/lit8 v3, v0, 0x1

    .line 1353
    iget-object v4, p0, Ll/ۘܰܽ;->ܰ:[C

    aget-char v0, v4, v0

    if-ne v0, p1, :cond_0

    .line 1355
    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    return-void

    :cond_0
    const/16 v4, 0x5c

    if-ne v0, v4, :cond_1

    .line 1358
    iput v3, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1359
    invoke-direct {p0}, Ll/ۘܰܽ;->᩷ۙ()C

    .line 1360
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1361
    iget v1, p0, Ll/ۘܰܽ;->֡:I

    goto :goto_1

    :cond_1
    const/16 v4, 0xa

    if-ne v0, v4, :cond_2

    .line 1363
    iget v0, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۘܰܽ;->۟:I

    .line 1364
    iput v3, p0, Ll/ۘܰܽ;->ᩳ:I

    :cond_2
    move v0, v3

    goto :goto_1

    .line 1367
    :cond_3
    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1368
    invoke-direct {p0, v2}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "Unterminated string"

    .line 1369
    invoke-direct {p0, p1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private ᩸ۙ()V
    .locals 4

    .line 1740
    :cond_0
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v1, p0, Ll/ۘܰܽ;->֡:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    invoke-direct {p0, v2}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1741
    :cond_1
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget-object v3, p0, Ll/ۘܰܽ;->ܰ:[C

    aget-char v0, v3, v0

    const/16 v3, 0xa

    if-ne v0, v3, :cond_2

    .line 1743
    iget v0, p0, Ll/ۘܰܽ;->۟:I

    add-int/2addr v0, v2

    iput v0, p0, Ll/ۘܰܽ;->۟:I

    .line 1744
    iput v1, p0, Ll/ۘܰܽ;->ᩳ:I

    return-void

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    :cond_3
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    const/4 v0, 0x0

    .line 1484
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1485
    iget-object v1, p0, Ll/ۘܰܽ;->ۤۙ:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    .line 1486
    iput v0, p0, Ll/ۘܰܽ;->᩸ۙ:I

    .line 1487
    iget-object v0, p0, Ll/ۘܰܽ;->ܿ:Ljava/io/StringReader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1776
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֡()Ljava/lang/String;
    .locals 3

    .line 959
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 961
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    const-string v0, "a name"

    .line 975
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    .line 966
    :pswitch_0
    invoke-direct {p0}, Ll/ۘܰܽ;->۬()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const/16 v0, 0x22

    .line 972
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x27

    .line 969
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 977
    iput v1, p0, Ll/ۘܰܽ;->ۖ:I

    .line 978
    iget-object v1, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ֨()Ll/ܰܰܽ;
    .locals 1

    .line 552
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 554
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 586
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 584
    :pswitch_0
    sget-object v0, Ll/ܰܰܽ;->ᩳ:Ll/ܰܰܽ;

    return-object v0

    .line 582
    :pswitch_1
    sget-object v0, Ll/ܰܰܽ;->ۖ:Ll/ܰܰܽ;

    return-object v0

    .line 569
    :pswitch_2
    sget-object v0, Ll/ܰܰܽ;->֨:Ll/ܰܰܽ;

    return-object v0

    .line 579
    :pswitch_3
    sget-object v0, Ll/ܰܰܽ;->۠:Ll/ܰܰܽ;

    return-object v0

    .line 574
    :pswitch_4
    sget-object v0, Ll/ܰܰܽ;->ۡ:Ll/ܰܰܽ;

    return-object v0

    .line 572
    :pswitch_5
    sget-object v0, Ll/ܰܰܽ;->֡:Ll/ܰܰܽ;

    return-object v0

    .line 565
    :pswitch_6
    sget-object v0, Ll/ܰܰܽ;->۟:Ll/ܰܰܽ;

    return-object v0

    .line 563
    :pswitch_7
    sget-object v0, Ll/ܰܰܽ;->᩶:Ll/ܰܰܽ;

    return-object v0

    .line 561
    :pswitch_8
    sget-object v0, Ll/ܰܰܽ;->ۢ:Ll/ܰܰܽ;

    return-object v0

    .line 559
    :pswitch_9
    sget-object v0, Ll/ܰܰܽ;->ܿ:Ll/ܰܰܽ;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۗ()Z
    .locals 2

    .line 354
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v1, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ۘ()Z
    .locals 5

    .line 1038
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 1040
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 1048
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1049
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v1, v3

    aget v4, v0, v1

    add-int/2addr v4, v3

    aput v4, v0, v1

    return v2

    :cond_1
    const-string v0, "a boolean"

    .line 1052
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    .line 1044
    :cond_2
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1045
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v1, v3

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return v3
.end method

.method public ۙ()V
    .locals 3

    .line 468
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 470
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    .line 473
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(I)V

    .line 474
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    aput v0, v1, v2

    .line 475
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    return-void

    :cond_1
    const-string v0, "BEGIN_ARRAY"

    .line 477
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final ۙ(Ll/ᩴۨܽ;)V
    .locals 0

    .line 412
    invoke-static {p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    iput-object p1, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    return-void
.end method

.method public ۚ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 1833
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۟()V
    .locals 3

    .line 1062
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 1064
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    .line 1067
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1068
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_1
    const-string v0, "null"

    .line 1070
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ۠()V
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1509
    :cond_0
    iget v2, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v2, :cond_1

    .line 1511
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v2

    :cond_1
    const/16 v3, 0x27

    const/16 v4, 0x22

    const-string v5, "<skipped>"

    const/4 v6, 0x1

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_2

    :pswitch_1
    return-void

    .line 1568
    :pswitch_2
    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v3, p0, Ll/ۘܰܽ;->ۜ:I

    add-int/2addr v2, v3

    iput v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    goto :goto_2

    .line 1547
    :pswitch_3
    invoke-direct {p0}, Ll/ۘܰܽ;->ᩴۙ()V

    if-nez v1, :cond_3

    .line 1550
    iget-object v2, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v3, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1561
    :pswitch_4
    invoke-direct {p0, v4}, Ll/ۘܰܽ;->᩸(C)V

    if-nez v1, :cond_3

    .line 1564
    iget-object v2, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v3, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1554
    :pswitch_5
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->᩸(C)V

    if-nez v1, :cond_3

    .line 1557
    iget-object v2, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v3, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v3, v6

    aput-object v5, v2, v3

    goto :goto_2

    .line 1538
    :pswitch_6
    invoke-direct {p0}, Ll/ۘܰܽ;->ᩴۙ()V

    goto :goto_2

    .line 1544
    :pswitch_7
    invoke-direct {p0, v4}, Ll/ۘܰܽ;->᩸(C)V

    goto :goto_2

    .line 1541
    :pswitch_8
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->᩸(C)V

    goto :goto_2

    .line 1524
    :pswitch_9
    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v2, v6

    iput v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    goto :goto_0

    .line 1516
    :pswitch_a
    invoke-direct {p0, v6}, Ll/ۘܰܽ;->᩷(I)V

    goto :goto_1

    :pswitch_b
    if-nez v1, :cond_2

    .line 1532
    iget-object v2, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    iget v3, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v3, v6

    const/4 v4, 0x0

    aput-object v4, v2, v3

    .line 1534
    :cond_2
    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v2, v6

    iput v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    :goto_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_2

    :pswitch_c
    const/4 v2, 0x3

    .line 1520
    invoke-direct {p0, v2}, Ll/ۘܰܽ;->᩷(I)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 1577
    :cond_3
    :goto_2
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-gtz v1, :cond_0

    .line 1580
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v1, v6

    aget v2, v0, v1

    add-int/2addr v2, v6

    aput v2, v0, v1

    .line 1581
    invoke-direct {p0, v5}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final ۤ()I
    .locals 20

    move-object/from16 v0, p0

    .line 592
    iget-object v1, v0, Ll/ۘܰܽ;->ۤۙ:[I

    iget v2, v0, Ll/ۘܰܽ;->᩸ۙ:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    aget v4, v1, v2

    const/16 v6, 0xa

    const/16 v7, 0x3b

    const/16 v8, 0x2c

    const/16 v9, 0x27

    const/16 v10, 0x7d

    const/16 v11, 0x5d

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 593
    iget-object v14, v0, Ll/ۘܰܽ;->ܰ:[C

    const/4 v15, 0x7

    const/16 v17, 0x4

    const/4 v5, 0x5

    packed-switch v4, :pswitch_data_0

    .line 700
    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v4}, Ljava/lang/AssertionError;-><init>(I)V

    throw v1

    .line 698
    :pswitch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JsonReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 687
    :pswitch_1
    invoke-direct {v0, v12}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/16 v1, 0x11

    .line 689
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 692
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    .line 693
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    goto/16 :goto_1

    .line 680
    :pswitch_2
    iget-object v1, v0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v2, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    if-ne v1, v2, :cond_3

    .line 1965
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    .line 1966
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/lit8 v2, v1, -0x1

    iput v2, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/lit8 v1, v1, 0x4

    .line 1968
    iget v2, v0, Ll/ۘܰܽ;->֡:I

    if-le v1, v2, :cond_1

    invoke-direct {v0, v5}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1972
    :cond_1
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 1974
    aget-char v2, v14, v1

    const/16 v12, 0x29

    if-ne v2, v12, :cond_3

    add-int/lit8 v2, v1, 0x1

    aget-char v2, v14, v2

    if-ne v2, v11, :cond_3

    add-int/lit8 v2, v1, 0x2

    aget-char v2, v14, v2

    if-ne v2, v10, :cond_3

    add-int/lit8 v2, v1, 0x3

    aget-char v2, v14, v2

    if-ne v2, v9, :cond_3

    add-int/lit8 v2, v1, 0x4

    aget-char v2, v14, v2

    if-eq v2, v6, :cond_2

    goto :goto_0

    :cond_2
    add-int/2addr v1, v5

    .line 1983
    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 683
    :cond_3
    :goto_0
    iget-object v1, v0, Ll/ۘܰܽ;->ۤۙ:[I

    iget v2, v0, Ll/ۘܰܽ;->᩸ۙ:I

    sub-int/2addr v2, v3

    aput v15, v1, v2

    goto/16 :goto_1

    .line 662
    :pswitch_3
    aput v5, v1, v2

    .line 664
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_10

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_5

    .line 669
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    .line 670
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    iget v2, v0, Ll/ۘܰܽ;->֡:I

    if-lt v1, v2, :cond_4

    invoke-direct {v0, v3}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v1

    if-eqz v1, :cond_10

    :cond_4
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    aget-char v2, v14, v1

    const/16 v6, 0x3e

    if-ne v2, v6, :cond_10

    add-int/2addr v1, v3

    .line 671
    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    goto/16 :goto_1

    :cond_5
    const-string v1, "Expected \':\'"

    .line 675
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v13

    .line 617
    :pswitch_4
    aput v17, v1, v2

    if-ne v4, v5, :cond_8

    .line 620
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    if-eq v1, v8, :cond_8

    if-eq v1, v7, :cond_7

    if-ne v1, v10, :cond_6

    const/4 v1, 0x2

    .line 623
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_6
    const-string v1, "Unterminated object"

    .line 630
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v13

    .line 626
    :cond_7
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    .line 633
    :cond_8
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_d

    if-eq v1, v9, :cond_c

    const-string v2, "Expected name"

    if-eq v1, v10, :cond_a

    .line 650
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    .line 651
    iget v4, v0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v4, v3

    iput v4, v0, Ll/ۘܰܽ;->ۙۙ:I

    int-to-char v1, v1

    .line 652
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->ۙ(C)Z

    move-result v1

    if-eqz v1, :cond_9

    const/16 v1, 0xe

    .line 653
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 656
    :cond_9
    invoke-direct {v0, v2}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v13

    :cond_a
    if-eq v4, v5, :cond_b

    const/4 v1, 0x2

    .line 644
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 647
    :cond_b
    invoke-direct {v0, v2}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v13

    .line 639
    :cond_c
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    const/16 v1, 0xc

    .line 640
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_d
    const/16 v1, 0xd

    .line 636
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 600
    :pswitch_5
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    if-eq v1, v8, :cond_10

    if-eq v1, v7, :cond_f

    if-ne v1, v11, :cond_e

    const/4 v1, 0x4

    .line 603
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_e
    const-string v1, "Unterminated array"

    .line 610
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v13

    .line 606
    :cond_f
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    goto :goto_1

    :pswitch_6
    const/4 v6, 0x2

    .line 595
    aput v6, v1, v2

    .line 703
    :cond_10
    :goto_1
    invoke-direct {v0, v3}, Ll/ۘܰܽ;->᩷(Z)I

    move-result v1

    const/16 v2, 0x22

    if-eq v1, v2, :cond_41

    if-eq v1, v9, :cond_40

    if-eq v1, v8, :cond_3c

    if-eq v1, v7, :cond_3c

    const/16 v2, 0x5b

    const/4 v6, 0x3

    if-eq v1, v2, :cond_3b

    if-eq v1, v11, :cond_3a

    const/16 v2, 0x7b

    if-eq v1, v2, :cond_39

    .line 736
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v1, v3

    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 760
    aget-char v1, v14, v1

    const/16 v2, 0x46

    if-eq v1, v2, :cond_13

    const/16 v2, 0x4e

    if-eq v1, v2, :cond_12

    const/16 v2, 0x54

    if-eq v1, v2, :cond_11

    const/16 v2, 0x66

    if-eq v1, v2, :cond_13

    const/16 v2, 0x6e

    if-eq v1, v2, :cond_12

    const/16 v2, 0x74

    if-eq v1, v2, :cond_11

    goto :goto_5

    :cond_11
    const-string v1, "true"

    const-string v2, "TRUE"

    const/4 v4, 0x5

    goto :goto_2

    :cond_12
    const-string v1, "null"

    const-string v2, "NULL"

    const/4 v4, 0x7

    goto :goto_2

    :cond_13
    const-string v1, "false"

    const-string v2, "FALSE"

    const/4 v4, 0x6

    .line 790
    :goto_2
    iget-object v7, v0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v8, Ll/ᩴۨܽ;->֡:Ll/ᩴۨܽ;

    if-eq v7, v8, :cond_14

    const/4 v7, 0x1

    goto :goto_3

    :cond_14
    const/4 v7, 0x0

    .line 793
    :goto_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v8

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_17

    .line 795
    iget v10, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v10, v9

    iget v11, v0, Ll/ۘܰܽ;->֡:I

    if-lt v10, v11, :cond_15

    add-int/lit8 v10, v9, 0x1

    invoke-direct {v0, v10}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v10

    if-nez v10, :cond_15

    goto :goto_5

    .line 798
    :cond_15
    iget v10, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v10, v9

    aget-char v10, v14, v10

    .line 799
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-eq v10, v11, :cond_16

    if-eqz v7, :cond_19

    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v10, v11, :cond_19

    :cond_16
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 805
    :cond_17
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v8

    iget v2, v0, Ll/ۘܰܽ;->֡:I

    if-lt v1, v2, :cond_18

    add-int/lit8 v1, v8, 0x1

    invoke-direct {v0, v1}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_18
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v8

    aget-char v1, v14, v1

    invoke-direct {v0, v1}, Ll/ۘܰܽ;->ۙ(C)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_19
    :goto_5
    const/4 v4, 0x0

    goto :goto_6

    .line 810
    :cond_1a
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v8

    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 811
    iput v4, v0, Ll/ۘܰܽ;->ۖ:I

    :goto_6
    if-eqz v4, :cond_1b

    return v4

    .line 818
    :cond_1b
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 819
    iget v2, v0, Ll/ۘܰܽ;->֡:I

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const-wide/16 v15, 0x0

    :goto_7
    add-int v12, v1, v9

    if-ne v12, v2, :cond_1e

    .line 831
    array-length v1, v14

    if-ne v9, v1, :cond_1c

    goto/16 :goto_11

    :cond_1c
    add-int/lit8 v1, v9, 0x1

    .line 836
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->ۙ(I)Z

    move-result v1

    if-nez v1, :cond_1d

    :goto_8
    const/4 v1, 0x2

    goto/16 :goto_d

    .line 839
    :cond_1d
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    .line 840
    iget v2, v0, Ll/ۘܰܽ;->֡:I

    :cond_1e
    add-int v12, v1, v9

    .line 843
    aget-char v12, v14, v12

    const/16 v13, 0x2b

    if-eq v12, v13, :cond_34

    const/16 v13, 0x45

    if-eq v12, v13, :cond_32

    const/16 v13, 0x65

    if-eq v12, v13, :cond_32

    const/16 v13, 0x2d

    if-eq v12, v13, :cond_30

    const/16 v13, 0x2e

    if-eq v12, v13, :cond_2f

    const/16 v13, 0x30

    if-lt v12, v13, :cond_28

    const/16 v13, 0x39

    if-le v12, v13, :cond_1f

    goto :goto_c

    :cond_1f
    if-eq v4, v3, :cond_27

    if-nez v4, :cond_20

    goto :goto_b

    :cond_20
    const/4 v3, 0x2

    if-ne v4, v3, :cond_24

    if-eqz v10, :cond_21

    cmp-long v3, v7, v15

    if-nez v3, :cond_21

    goto/16 :goto_11

    :cond_21
    const-wide/16 v18, 0xa

    mul-long v18, v18, v7

    add-int/lit8 v12, v12, -0x30

    int-to-long v12, v12

    sub-long v18, v18, v12

    const-wide v12, -0xcccccccccccccccL

    cmp-long v3, v7, v12

    if-gtz v3, :cond_23

    if-nez v3, :cond_22

    cmp-long v3, v18, v7

    if-gez v3, :cond_22

    goto :goto_9

    :cond_22
    const/4 v3, 0x0

    goto :goto_a

    :cond_23
    :goto_9
    const/4 v3, 0x1

    :goto_a
    and-int/2addr v10, v3

    move-wide/from16 v7, v18

    goto/16 :goto_10

    :cond_24
    if-ne v4, v6, :cond_25

    const/4 v4, 0x4

    goto/16 :goto_10

    :cond_25
    const/4 v3, 0x6

    if-eq v4, v5, :cond_26

    if-ne v4, v3, :cond_35

    :cond_26
    const/4 v3, 0x7

    const/4 v4, 0x7

    goto/16 :goto_10

    :cond_27
    :goto_b
    add-int/lit8 v12, v12, -0x30

    neg-int v3, v12

    int-to-long v3, v3

    const/4 v7, 0x2

    move-wide v7, v3

    const/4 v4, 0x2

    goto :goto_10

    .line 880
    :cond_28
    :goto_c
    invoke-direct {v0, v12}, Ll/ۘܰܽ;->ۙ(C)Z

    move-result v1

    if-nez v1, :cond_36

    goto :goto_8

    :goto_d
    if-ne v4, v1, :cond_2d

    if-eqz v10, :cond_2c

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v3, v7, v1

    if-nez v3, :cond_29

    if-eqz v11, :cond_2c

    :cond_29
    cmp-long v1, v7, v15

    if-nez v1, :cond_2a

    if-nez v11, :cond_2c

    :cond_2a
    if-eqz v11, :cond_2b

    goto :goto_e

    :cond_2b
    neg-long v7, v7

    .line 912
    :goto_e
    iput-wide v7, v0, Ll/ۘܰܽ;->۠:J

    .line 913
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    add-int/2addr v1, v9

    iput v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    const/16 v1, 0xf

    .line 914
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    goto :goto_12

    :cond_2c
    const/4 v1, 0x2

    :cond_2d
    if-eq v4, v1, :cond_2e

    const/4 v1, 0x4

    if-eq v4, v1, :cond_2e

    const/4 v1, 0x7

    if-ne v4, v1, :cond_36

    .line 919
    :cond_2e
    iput v9, v0, Ll/ۘܰܽ;->ۜ:I

    const/16 v1, 0x10

    .line 920
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    goto :goto_12

    :cond_2f
    const/4 v3, 0x2

    if-ne v4, v3, :cond_36

    const/4 v3, 0x3

    const/4 v4, 0x3

    goto :goto_10

    :cond_30
    if-nez v4, :cond_31

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v4, 0x1

    const/4 v11, 0x1

    goto :goto_10

    :cond_31
    if-ne v4, v5, :cond_36

    goto :goto_f

    :cond_32
    const/4 v3, 0x2

    if-eq v4, v3, :cond_33

    const/4 v3, 0x4

    if-ne v4, v3, :cond_36

    :cond_33
    const/4 v3, 0x5

    const/4 v4, 0x5

    goto :goto_10

    :cond_34
    if-ne v4, v5, :cond_36

    :goto_f
    const/4 v3, 0x6

    const/4 v4, 0x6

    :cond_35
    :goto_10
    add-int/lit8 v9, v9, 0x1

    const/4 v3, 0x1

    const/4 v13, 0x0

    goto/16 :goto_7

    :cond_36
    :goto_11
    const/4 v1, 0x0

    :goto_12
    if-eqz v1, :cond_37

    return v1

    .line 749
    :cond_37
    iget v1, v0, Ll/ۘܰܽ;->ۙۙ:I

    aget-char v1, v14, v1

    invoke-direct {v0, v1}, Ll/ۘܰܽ;->ۙ(C)Z

    move-result v1

    if-eqz v1, :cond_38

    .line 753
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    const/16 v1, 0xa

    .line 754
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_38
    const-string v1, "Expected value"

    .line 750
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    :cond_39
    const/4 v1, 0x1

    .line 733
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_3a
    const/4 v1, 0x1

    if-ne v4, v1, :cond_3d

    const/4 v1, 0x4

    .line 707
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 730
    :cond_3b
    iput v6, v0, Ll/ۘܰܽ;->ۖ:I

    return v6

    :cond_3c
    const/4 v1, 0x1

    :cond_3d
    if-eq v4, v1, :cond_3f

    const/4 v2, 0x2

    if-ne v4, v2, :cond_3e

    goto :goto_13

    :cond_3e
    const-string v1, "Unexpected value"

    .line 720
    invoke-direct {v0, v1}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    const/4 v1, 0x0

    throw v1

    .line 715
    :cond_3f
    :goto_13
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    .line 716
    iget v2, v0, Ll/ۘܰܽ;->ۙۙ:I

    sub-int/2addr v2, v1

    iput v2, v0, Ll/ۘܰܽ;->ۙۙ:I

    const/4 v1, 0x7

    .line 717
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    .line 723
    :cond_40
    invoke-direct/range {p0 .. p0}, Ll/ۘܰܽ;->ۜ()V

    const/16 v1, 0x8

    .line 724
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    :cond_41
    const/16 v1, 0x9

    .line 727
    iput v1, v0, Ll/ۘܰܽ;->ۖ:I

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public ۫()V
    .locals 5

    .line 527
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 529
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 532
    iget v0, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v0, -0x1

    iput v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    .line 533
    iget-object v3, p0, Ll/ۘܰܽ;->ۡ:[Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v4, v3, v2

    .line 534
    iget-object v2, p0, Ll/ۘܰܽ;->֨:[I

    sub-int/2addr v0, v1

    aget v1, v2, v0

    add-int/lit8 v1, v1, 0x1

    aput v1, v2, v0

    const/4 v0, 0x0

    .line 535
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    return-void

    :cond_1
    const-string v0, "END_OBJECT"

    .line 537
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ܰ()D
    .locals 6

    .line 1085
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 1087
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-eq v0, v1, :cond_5

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_0

    const-string v0, "a double"

    .line 1109
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    .line 1104
    :pswitch_0
    invoke-direct {p0}, Ll/ۘܰܽ;->۬()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    goto :goto_1

    :pswitch_1
    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    const/16 v0, 0x27

    goto :goto_0

    :cond_1
    const/16 v0, 0x22

    .line 1101
    :goto_0
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    goto :goto_1

    .line 1096
    :cond_2
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v3, p0, Ll/ۘܰܽ;->ۜ:I

    iget-object v4, p0, Ll/ۘܰܽ;->ܰ:[C

    invoke-direct {v0, v4, v1, v3}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1097
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v1, p0, Ll/ۘܰܽ;->ۜ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    :goto_1
    :pswitch_2
    const/16 v0, 0xb

    .line 1112
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1115
    :try_start_0
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1122
    iget-object v3, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    sget-object v4, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    const/4 v5, 0x0

    if-eq v3, v4, :cond_4

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    .line 1123
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "JSON forbids NaN and infinities: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v5

    .line 1125
    :cond_4
    :goto_2
    iget-object v3, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1126
    iput-object v5, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1127
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1128
    iget-object v2, p0, Ll/ۘܰܽ;->֨:[I

    iget v4, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v4, v4, -0x1

    aget v5, v2, v4

    add-int/lit8 v5, v5, 0x1

    aput v5, v2, v4

    .line 1129
    invoke-direct {p0, v3}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V

    return-wide v0

    :catch_0
    move-exception v0

    .line 1117
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected a double but was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 1119
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1120
    throw v1

    .line 1092
    :cond_5
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1093
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 1094
    iget-wide v0, p0, Ll/ۘܰܽ;->۠:J

    long-to-double v0, v0

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public ܳ()V
    .locals 3

    .line 488
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 490
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    .line 493
    iget v0, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    .line 494
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    add-int/lit8 v0, v0, -0x2

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    .line 495
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    return-void

    :cond_1
    const-string v0, "END_ARRAY"

    .line 497
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public final ܶ()Ll/ᩴۨܽ;
    .locals 1

    .line 423
    iget-object v0, p0, Ll/ۘܰܽ;->ᩴۙ:Ll/ᩴۨܽ;

    return-object v0
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 1851
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܿ()J
    .locals 10

    const-string v0, "Expected a long but was "

    .line 1143
    iget v1, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v1, :cond_0

    .line 1145
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v1

    :cond_0
    const/16 v2, 0xf

    const/4 v3, 0x0

    if-eq v1, v2, :cond_7

    const/16 v2, 0x10

    const/4 v4, 0x0

    if-eq v1, v2, :cond_5

    packed-switch v1, :pswitch_data_0

    const-string v0, "a long"

    .line 1177
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_0
    const/16 v2, 0xa

    if-ne v1, v2, :cond_1

    .line 1161
    invoke-direct {p0}, Ll/ۘܰܽ;->۬()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    goto :goto_1

    :cond_1
    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    const/16 v1, 0x27

    goto :goto_0

    :cond_2
    const/16 v1, 0x22

    .line 1163
    :goto_0
    invoke-direct {p0, v1}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1165
    :goto_1
    iget-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1987
    sget v2, Ll/ܽ᩺ܽ;->ܳۙ:I

    const/4 v2, 0x0

    .line 429
    :goto_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_4

    .line 430
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7f

    if-gt v5, v6, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const-string v0, "String contains non-ASCII characters: "

    .line 1988
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v4

    .line 1167
    :cond_4
    :try_start_0
    iget-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 1168
    iput v3, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1169
    iget-object v5, p0, Ll/ۘܰܽ;->֨:[I

    iget v6, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v6, v6, -0x1

    aget v7, v5, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v5, v6

    .line 1170
    iget-object v5, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-direct {p0, v5}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v1

    .line 1154
    :cond_5
    new-instance v1, Ljava/lang/String;

    iget v2, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v5, p0, Ll/ۘܰܽ;->ۜ:I

    iget-object v6, p0, Ll/ۘܰܽ;->ܰ:[C

    invoke-direct {v1, v6, v2, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1155
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v2, p0, Ll/ۘܰܽ;->ۜ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    :catch_0
    const/16 v1, 0xb

    .line 1180
    iput v1, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1183
    :try_start_1
    iget-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    double-to-long v5, v1

    long-to-double v7, v5

    cmpl-double v9, v7, v1

    if-nez v9, :cond_6

    .line 1194
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1195
    iput-object v4, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1196
    iput v3, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1197
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    .line 1198
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V

    return-wide v5

    .line 1192
    :cond_6
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_1
    move-exception v1

    .line 1185
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1186
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 1187
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1188
    throw v2

    .line 1150
    :cond_7
    iput v3, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1151
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 1152
    iget-wide v0, p0, Ll/ۘܰܽ;->۠:J

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public ᩳ()Ljava/lang/String;
    .locals 4

    .line 997
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 999
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    const-string v0, "a string"

    .line 1024
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    .line 1013
    :pswitch_0
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    const/4 v1, 0x0

    .line 1014
    iput-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    goto :goto_0

    .line 1004
    :pswitch_1
    invoke-direct {p0}, Ll/ۘܰܽ;->۬()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    const/16 v0, 0x22

    .line 1010
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :pswitch_3
    const/16 v0, 0x27

    .line 1007
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1020
    :cond_1
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v2, p0, Ll/ۘܰܽ;->ۜ:I

    iget-object v3, p0, Ll/ۘܰܽ;->ܰ:[C

    invoke-direct {v0, v3, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 1021
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v2, p0, Ll/ۘܰܽ;->ۜ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    goto :goto_0

    .line 1017
    :cond_2
    iget-wide v0, p0, Ll/ۘܰܽ;->۠:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    .line 1026
    iput v1, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1027
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    .line 1028
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩵()Ljava/lang/String;
    .locals 5

    .line 1780
    iget v0, p0, Ll/ۘܰܽ;->۟:I

    add-int/lit8 v0, v0, 0x1

    .line 1781
    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v2, p0, Ll/ۘܰܽ;->ᩳ:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    const-string v2, " column "

    const-string v3, " path "

    const-string v4, " at line "

    .line 0
    invoke-static {v4, v0, v2, v3, v1}, Ll/֨᩵ᩴ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1782
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۚ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ᩶()I
    .locals 9

    .line 1415
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 1417
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    const-string v3, "Expected an int but was "

    if-ne v0, v1, :cond_2

    .line 1422
    iget-wide v0, p0, Ll/ۘܰܽ;->۠:J

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v7, v0, v5

    if-nez v7, :cond_1

    .line 1426
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1427
    iget-object v0, p0, Ll/ۘܰܽ;->֨:[I

    iget v1, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    .line 1424
    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/ۘܰܽ;->۠:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x10

    const/4 v4, 0x0

    if-ne v0, v1, :cond_3

    .line 1432
    new-instance v0, Ljava/lang/String;

    iget v1, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v5, p0, Ll/ۘܰܽ;->ۜ:I

    iget-object v6, p0, Ll/ۘܰܽ;->ܰ:[C

    invoke-direct {v0, v6, v1, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1433
    iget v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    iget v1, p0, Ll/ۘܰܽ;->ۜ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۘܰܽ;->ۙۙ:I

    goto :goto_4

    :cond_3
    const/16 v1, 0xa

    const/16 v5, 0x8

    if-eq v0, v5, :cond_5

    const/16 v6, 0x9

    if-eq v0, v6, :cond_5

    if-ne v0, v1, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "an int"

    .line 1451
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    .line 1436
    invoke-direct {p0}, Ll/ۘܰܽ;->۬()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    goto :goto_2

    :cond_6
    if-ne v0, v5, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    .line 1438
    :goto_1
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۤ(C)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1440
    :goto_2
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1987
    sget v1, Ll/ܽ᩺ܽ;->ܳۙ:I

    const/4 v1, 0x0

    .line 429
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v1, v5, :cond_9

    .line 430
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7f

    if-gt v5, v6, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_8
    const-string v1, "String contains non-ASCII characters: "

    .line 1988
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(Ljava/lang/String;)V

    throw v4

    .line 1442
    :cond_9
    :try_start_0
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 1443
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1444
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    iget v5, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v5, v5, -0x1

    aget v6, v1, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v1, v5

    .line 1445
    iget-object v1, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-direct {p0, v1}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    :goto_4
    const/16 v0, 0xb

    .line 1454
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1457
    :try_start_1
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    double-to-int v5, v0

    int-to-double v6, v5

    cmpl-double v8, v6, v0

    if-nez v8, :cond_a

    .line 1468
    iget-object v0, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1469
    iput-object v4, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    .line 1470
    iput v2, p0, Ll/ۘܰܽ;->ۖ:I

    .line 1471
    iget-object v1, p0, Ll/ۘܰܽ;->֨:[I

    iget v2, p0, Ll/ۘܰܽ;->᩸ۙ:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    .line 1472
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->ۙ(Ljava/lang/String;)V

    return v5

    .line 1466
    :cond_a
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_1
    move-exception v0

    .line 1459
    new-instance v1, Ljava/lang/NumberFormatException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Ll/ۘܰܽ;->۬:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1460
    invoke-virtual {p0}, Ll/ۘܰܽ;->᩵()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 1461
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1462
    throw v1
.end method

.method public ᩷()V
    .locals 2

    .line 508
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 510
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    .line 513
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩷(I)V

    const/4 v0, 0x0

    .line 514
    iput v0, p0, Ll/ۘܰܽ;->ۖ:I

    return-void

    :cond_1
    const-string v0, "BEGIN_OBJECT"

    .line 516
    invoke-direct {p0, v0}, Ll/ۘܰܽ;->᩸(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0
.end method

.method public ᩹()Z
    .locals 2

    .line 543
    iget v0, p0, Ll/ۘܰܽ;->ۖ:I

    if-nez v0, :cond_0

    .line 545
    invoke-virtual {p0}, Ll/ۘܰܽ;->ۤ()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

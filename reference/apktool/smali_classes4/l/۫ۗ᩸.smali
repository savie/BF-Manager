.class public final Ll/۫ۗ᩸;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ֡:Ll/ۡܶ᩸;

.field public final ֨:Ljava/util/UUID;

.field public final ۖ:I

.field public ۜ:Ll/ۨۤᩴ;

.field public ۟:Ll/ۗۙᩴ;

.field public final ۠:J

.field public ۡ:Ll/ܳۗ᩸;

.field public ۢ:Ll/᩵ۙᩴ;

.field public ܰ:Ll/ۗܶ᩸;

.field public ܿ:Ll/ܿۢ᩸;

.field public final ᩳ:J

.field public ᩶:[B


# direct methods
.method public constructor <init>(Ll/ۗܶ᩸;Ll/ۡܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JILjava/util/UUID;J[B)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    iput-object p2, p0, Ll/۫ۗ᩸;->֡:Ll/ۡܶ᩸;

    iput-object p3, p0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    .line 47
    iput-object p4, p0, Ll/۫ۗ᩸;->ۢ:Ll/᩵ۙᩴ;

    iput-object p5, p0, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    .line 48
    iput-object p12, p0, Ll/۫ۗ᩸;->᩶:[B

    .line 49
    iput-wide p6, p0, Ll/۫ۗ᩸;->۠:J

    iput p8, p0, Ll/۫ۗ᩸;->ۖ:I

    iput-object p9, p0, Ll/۫ۗ᩸;->֨:Ljava/util/UUID;

    iput-wide p10, p0, Ll/۫ۗ᩸;->ᩳ:J

    return-void
.end method

.method public synthetic constructor <init>(Ll/ۗܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JI[B)V
    .locals 13

    const/4 v9, 0x0

    const-wide/16 v10, -0x1

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v12, p8

    .line 0
    invoke-direct/range {v0 .. v12}, Ll/۫ۗ᩸;-><init>(Ll/ۗܶ᩸;Ll/ۡܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JILjava/util/UUID;J[B)V

    return-void
.end method

.method public static ۙ(Landroid/os/Bundle;)J
    .locals 19

    .line 141
    invoke-virtual/range {p0 .. p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0xc

    move-wide v9, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    .line 143
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v3, v2

    const-wide/16 v13, 0x2

    const-wide/16 v7, 0x5

    move-wide v5, v13

    invoke-static/range {v3 .. v10}, Ll/ۧ᩺᩻;->ۙ(JJJJ)J

    move-result-wide v17

    move-object/from16 v2, p0

    .line 144
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    .line 145
    instance-of v3, v1, Ljava/lang/String;

    const-wide/16 v15, 0x4

    if-eqz v3, :cond_0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-long v11, v1

    invoke-static/range {v11 .. v18}, Ll/ۧ᩺᩻;->ۙ(JJJJ)J

    move-result-wide v9

    goto :goto_0

    .line 146
    :cond_0
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    const-wide/16 v3, 0x1

    goto :goto_2

    .line 147
    :cond_1
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_2

    add-long v17, v17, v15

    :goto_1
    move-wide/from16 v9, v17

    goto :goto_0

    .line 148
    :cond_2
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_3

    const-wide/16 v3, 0x8

    :goto_2
    add-long v17, v17, v3

    goto :goto_1

    :cond_3
    if-nez v1, :cond_4

    goto :goto_1

    .line 149
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported fragment config value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment config key"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-wide v9
.end method

.method private ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;)Ll/ۤۗ᩸;
    .locals 11

    .line 265
    iget-object v0, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    invoke-static {v0}, Ll/ܳۗ᩸;->ۙ(Ll/ܳۗ᩸;)[B

    move-result-object v5

    iget-object v0, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    invoke-static {v0}, Ll/ܳۗ᩸;->ۙ(Ll/ܳۗ᩸;)[B

    move-result-object v0

    array-length v6, v0

    iget-object v7, p0, Ll/۫ۗ᩸;->᩶:[B

    iget-object v9, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    iget-object v10, p0, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    const/high16 v8, 0x800000

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v1 .. v10}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[BI[BILl/ܳۗ᩸;Ll/ۗۙᩴ;)Ll/ۤۗ᩸;

    move-result-object p1

    return-object p1
.end method

.method public static ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[BI[BIIILl/ܿۢ᩸;Ll/ܳۗ᩸;Ll/ۗۙᩴ;)Ll/ۤۗ᩸;
    .locals 14

    move-object/from16 v0, p2

    move/from16 v1, p5

    move-object/from16 v2, p6

    move/from16 v3, p7

    move/from16 v4, p8

    move-object v5, p1

    .line 158
    invoke-static {v3, p1}, Ll/ۗܶ᩸;->ۙ(ILandroid/os/Bundle;)Ll/ۗܶ᩸;

    move-result-object v5

    .line 159
    invoke-virtual {v5, v3}, Ll/ۗܶ᩸;->ۙ(I)[B

    move-result-object v3

    .line 160
    new-instance v6, Ll/ۛۚۤ;

    invoke-direct {v6, v4}, Ll/ۛۚۤ;-><init>(I)V

    const v7, 0x32465345

    .line 161
    invoke-virtual {v6, v7}, Ll/ۛۚۤ;->writeInt(I)V

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Ll/ۛۚۤ;->writeInt(I)V

    invoke-virtual {v6, v4}, Ll/ۛۚۤ;->writeInt(I)V

    .line 162
    invoke-virtual {p0}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Ll/ۛۚۤ;->᩷(J)V

    invoke-virtual {p0}, Ll/۠ܿ᩸;->length()I

    move-result v8

    invoke-virtual {v6, v8}, Ll/ۛۚۤ;->writeInt(I)V

    .line 163
    invoke-virtual {v6, v3}, Ll/ۛۚۤ;->᩷([B)V

    move/from16 v3, p9

    .line 164
    invoke-virtual {v6, v3}, Ll/ۛۚۤ;->writeInt(I)V

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v6, v7}, Ll/ۛۚۤ;->ۙ(Z)V

    if-eqz v0, :cond_1

    .line 165
    invoke-virtual {v0, v6}, Ll/᩸᩶᩸;->ۙ(Ll/ۛۚۤ;)V

    .line 166
    :cond_1
    invoke-virtual/range {p3 .. p3}, Ll/ۨۤᩴ;->ۙ()J

    move-result-wide v7

    long-to-int v0, v7

    invoke-virtual {v6, v0}, Ll/ۛۚۤ;->writeInt(I)V

    move-object/from16 v7, p3

    invoke-virtual {v7, v6}, Ll/ۨۤᩴ;->ۙ(Ll/ۛۚۤ;)V

    .line 167
    invoke-virtual {v6, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 168
    new-instance v8, Ll/᩸ۗ᩸;

    invoke-virtual {v6}, Ll/ۛۚۤ;->size()I

    move-result v0

    invoke-direct {v8, v0, v1}, Ll/᩸ۗ᩸;-><init>(II)V

    move-object/from16 v0, p4

    .line 169
    invoke-virtual {v6, v0, v3, v1}, Ll/ۛۚۤ;->write([BII)V

    .line 171
    array-length v0, v2

    invoke-virtual {v6, v0}, Ll/ۛۚۤ;->writeInt(I)V

    .line 172
    new-instance v9, Ll/᩸ۗ᩸;

    invoke-virtual {v6}, Ll/ۛۚۤ;->size()I

    move-result v0

    array-length v1, v2

    invoke-direct {v9, v0, v1}, Ll/᩸ۗ᩸;-><init>(II)V

    .line 44
    array-length v0, v2

    invoke-virtual {v6, v2, v3, v0}, Ll/ۛۚۤ;->write([BII)V

    .line 174
    invoke-virtual {v6}, Ll/ۛۚۤ;->size()I

    move-result v0

    add-int/lit8 v1, v4, -0x4

    if-ne v0, v1, :cond_2

    .line 175
    invoke-virtual {v6}, Ll/ۛۚۤ;->᩷()[B

    move-result-object v0

    invoke-virtual {v6}, Ll/ۛۚۤ;->size()I

    move-result v1

    .line 503
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v2, v0, v3, v1}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 175
    invoke-virtual {v6, v1}, Ll/ۛۚۤ;->writeInt(I)V

    .line 176
    new-instance v12, Ll/ۤۗ᩸;

    invoke-virtual {v6}, Ll/ۛۚۤ;->۫()[B

    move-result-object v1

    .line 177
    invoke-virtual {p0}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v10

    invoke-virtual {p0}, Ll/۠ܿ᩸;->length()I

    move-result v13

    move-object v0, v12

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object v4, v5

    move-object/from16 v5, p3

    move-object/from16 v6, p12

    move-object v7, v8

    move-object v8, v9

    move-wide v9, v10

    move v11, v13

    invoke-direct/range {v0 .. v11}, Ll/ۤۗ᩸;-><init>([BLl/ܿۢ᩸;Ll/ܳۗ᩸;Ll/ۗܶ᩸;Ll/ۨۤᩴ;Ll/ۗۙᩴ;Ll/᩸ۗ᩸;Ll/᩸ۗ᩸;JI)V

    return-object v12

    .line 174
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment state changed while being captured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[BI[BILl/ܳۗ᩸;Ll/ۗۙᩴ;)Ll/ۤۗ᩸;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    .line 116
    invoke-static/range {p1 .. p1}, Ll/۫ۗ᩸;->ۙ(Landroid/os/Bundle;)J

    move-result-wide v1

    if-nez v3, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    .line 117
    :cond_0
    invoke-virtual {v3, v8}, Ll/᩸᩶᩸;->ۙ(I)I

    move-result v4

    :goto_0
    int-to-long v4, v4

    const-wide/16 v9, 0x1

    add-long/2addr v4, v9

    const-wide/16 v9, 0x30

    add-long/2addr v9, v1

    add-long/2addr v9, v4

    .line 118
    invoke-virtual/range {p3 .. p3}, Ll/ۨۤᩴ;->ۙ()J

    move-result-wide v11

    add-long/2addr v11, v9

    int-to-long v9, v6

    add-long/2addr v11, v9

    array-length v13, v7

    int-to-long v13, v13

    add-long/2addr v11, v13

    const/16 v13, 0x30

    if-lt v8, v13, :cond_7

    int-to-long v13, v8

    cmp-long v15, v11, v13

    if-gtz v15, :cond_7

    const-wide/32 v13, 0x7ffffff7

    cmp-long v15, v11, v13

    if-gtz v15, :cond_7

    const/4 v13, 0x0

    move-object/from16 v14, p4

    .line 123
    invoke-static {v13, v14, v6, v8}, Ll/᩵ۙᩴ;->᩷(I[BII)I

    move-result v13

    const-wide/16 v15, 0x14

    sub-long v9, v11, v9

    mul-long v9, v9, v15

    add-long v19, v9, v11

    int-to-long v9, v13

    const-wide/32 v21, 0x10000

    const-wide/16 v17, 0x4

    move-wide v15, v9

    .line 125
    invoke-static/range {v15 .. v22}, Ll/ۧ᩺᩻;->ۙ(JJJJ)J

    move-result-wide v9

    .line 24
    invoke-virtual/range {p0 .. p0}, Ll/۠ܿ᩸;->ܳ()Ll/᩷֡᩸;

    move-result-object v13

    .line 25
    iget-object v13, v13, Ll/᩷֡᩸;->᩸:Ll/ۢۢ᩸;

    if-nez v13, :cond_1

    const-wide v15, 0x7fffffffffffffffL

    goto :goto_1

    :cond_1
    iget-object v13, v13, Ll/ۢۢ᩸;->֡:Ll/֡ۢ᩸;

    invoke-virtual {v13}, Ll/֡ۢ᩸;->ۤ()J

    move-result-wide v15

    :goto_1
    cmp-long v13, v9, v15

    if-gtz v13, :cond_6

    add-long v9, v11, v1

    .line 128
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->size()I

    move-result v13

    int-to-long v13, v13

    const-wide/16 v15, 0x80

    mul-long v13, v13, v15

    add-long/2addr v13, v9

    invoke-virtual/range {p3 .. p3}, Ll/ۨۤᩴ;->ۙ()J

    move-result-wide v9

    add-long/2addr v9, v13

    const-wide/16 v13, 0x2000

    add-long/2addr v9, v13

    invoke-virtual {v0, v9, v10}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v17

    if-nez p8, :cond_2

    move v9, v6

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    int-to-long v9, v9

    add-long/2addr v9, v11

    const-wide/16 v18, 0x2

    mul-long v1, v1, v18

    add-long/2addr v1, v9

    .line 131
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->size()I

    move-result v9

    int-to-long v9, v9

    mul-long v9, v9, v15

    add-long/2addr v9, v1

    array-length v1, v7

    int-to-long v1, v1

    add-long/2addr v9, v1

    add-long/2addr v9, v13

    .line 130
    invoke-virtual {v0, v9, v10}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v14
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    long-to-int v9, v11

    long-to-int v10, v4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v11, v17

    move-object/from16 v12, p8

    move-object/from16 v13, p9

    .line 132
    :try_start_1
    invoke-static/range {v1 .. v13}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[BI[BIIILl/ܿۢ᩸;Ll/ܳۗ᩸;Ll/ۗۙᩴ;)Ll/ۤۗ᩸;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v14, :cond_3

    .line 136
    :try_start_2
    invoke-virtual {v14}, Ll/ܿۢ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v0

    :catchall_0
    move-exception v0

    const/4 v1, 0x1

    goto :goto_4

    :cond_3
    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, v0

    if-eqz v14, :cond_4

    .line 130
    :try_start_3
    invoke-virtual {v14}, Ll/ܿۢ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_3
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    :goto_4
    if-nez v1, :cond_5

    if-eqz v17, :cond_5

    .line 136
    invoke-virtual/range {v17 .. v17}, Ll/ܿۢ᩸;->close()V

    :cond_5
    throw v0

    .line 126
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Fragment state exceeds recovery workspace budget"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Fragment state exceeds recovery limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[B[BI)Ll/ۤۗ᩸;
    .locals 10

    move-object v4, p4

    .line 110
    array-length v5, v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p5

    move/from16 v7, p6

    invoke-static/range {v0 .. v9}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;[BI[BILl/ܳۗ᩸;Ll/ۗۙᩴ;)Ll/ۤۗ᩸;

    move-result-object v0

    return-object v0
.end method

.method private ۙ(Ljava/util/UUID;J)Ll/۫ۗ᩸;
    .locals 15

    move-object v0, p0

    .line 335
    new-instance v14, Ll/۫ۗ᩸;

    iget-object v2, v0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    iget-object v3, v0, Ll/۫ۗ᩸;->֡:Ll/ۡܶ᩸;

    iget-object v4, v0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    iget-object v5, v0, Ll/۫ۗ᩸;->ۢ:Ll/᩵ۙᩴ;

    iget-object v6, v0, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    iget v9, v0, Ll/۫ۗ᩸;->ۖ:I

    iget-object v13, v0, Ll/۫ۗ᩸;->᩶:[B

    iget-wide v7, v0, Ll/۫ۗ᩸;->۠:J

    move-object v1, v14

    move-object/from16 v10, p1

    move-wide/from16 v11, p2

    invoke-direct/range {v1 .. v13}, Ll/۫ۗ᩸;-><init>(Ll/ۗܶ᩸;Ll/ۡܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JILjava/util/UUID;J[B)V

    .line 337
    iget-object v1, v0, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    iput-object v1, v14, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    .line 338
    iget-object v1, v0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    iput-object v1, v14, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    const/4 v1, 0x0

    .line 339
    iput-object v1, v0, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    .line 340
    iput-object v1, v0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    .line 346
    iput-object v1, v0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    iput-object v1, v0, Ll/۫ۗ᩸;->֡:Ll/ۡܶ᩸;

    iput-object v1, v0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    iput-object v1, v0, Ll/۫ۗ᩸;->ۢ:Ll/᩵ۙᩴ;

    iput-object v1, v0, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    .line 347
    iput-object v1, v0, Ll/۫ۗ᩸;->᩶:[B

    return-object v14
.end method

.method public static ۙ(Ll/᩷ۗ᩸;ILl/ۜܿ᩸;)Ll/۫ۗ᩸;
    .locals 34

    move/from16 v0, p1

    move-object/from16 v1, p2

    .line 192
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۗ᩸;->ۙ()[B

    move-result-object v2

    if-ltz v0, :cond_8

    .line 193
    array-length v3, v2

    if-gt v3, v0, :cond_8

    array-length v3, v2

    const/16 v4, 0x30

    if-lt v3, v4, :cond_8

    .line 218
    new-instance v3, Ll/᩵ۚۤ;

    invoke-direct {v3, v2}, Ll/᩵ۚۤ;-><init>([B)V

    .line 219
    array-length v4, v2

    add-int/lit8 v4, v4, -0x4

    int-to-long v4, v4

    invoke-virtual {v3, v4, v5}, Ll/᩵ۚۤ;->seek(J)V

    .line 220
    invoke-virtual {v3}, Ll/᩵ۚۤ;->readInt()I

    move-result v4

    array-length v5, v2

    add-int/lit8 v5, v5, -0x4

    .line 503
    new-instance v6, Ljava/util/zip/CRC32;

    invoke-direct {v6}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v6, v2, v7, v5}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v6}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    long-to-int v6, v5

    if-ne v4, v6, :cond_7

    const-wide/16 v4, 0x0

    .line 221
    invoke-virtual {v3, v4, v5}, Ll/᩵ۚۤ;->seek(J)V

    .line 222
    invoke-virtual {v3}, Ll/᩵ۚۤ;->readInt()I

    move-result v4

    const v5, 0x32465345

    if-ne v4, v5, :cond_6

    invoke-virtual {v3}, Ll/᩵ۚۤ;->readInt()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_6

    invoke-virtual {v3}, Ll/᩵ۚۤ;->readInt()I

    move-result v4

    array-length v5, v2

    if-ne v4, v5, :cond_6

    .line 225
    invoke-virtual {v3}, Ll/᩵ۚۤ;->readLong()J

    move-result-wide v4

    invoke-virtual {v3}, Ll/᩵ۚۤ;->readInt()I

    move-result v6

    .line 226
    invoke-virtual/range {p2 .. p2}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v7

    cmp-long v9, v4, v7

    if-nez v9, :cond_5

    invoke-virtual/range {p2 .. p2}, Ll/۠ܿ᩸;->length()I

    move-result v4

    if-ne v6, v4, :cond_5

    .line 229
    invoke-static {v3}, Ll/۫ۗ᩸;->ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;

    move-result-object v4

    iget v5, v4, Ll/᩸ۗ᩸;->ۙ:I

    invoke-static {v3}, Ll/۫ۗ᩸;->ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;

    move-result-object v6

    iget v7, v6, Ll/᩸ۗ᩸;->ۙ:I

    invoke-static {v3}, Ll/۫ۗ᩸;->ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;

    move-result-object v8

    invoke-static {v3}, Ll/۫ۗ᩸;->ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;

    move-result-object v9

    invoke-static {v3}, Ll/۫ۗ᩸;->ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;

    move-result-object v10

    iget v11, v10, Ll/᩸ۗ᩸;->᩷:I

    iget v10, v10, Ll/᩸ۗ᩸;->ۙ:I

    .line 230
    invoke-virtual {v3}, Ll/᩵ۚۤ;->available()J

    move-result-wide v12

    const-wide/16 v14, 0x4

    cmp-long v3, v12, v14

    if-nez v3, :cond_4

    .line 197
    array-length v3, v2

    iget v12, v9, Ll/᩸ۗ᩸;->ۙ:I

    sub-int/2addr v3, v12

    int-to-long v12, v3

    const-wide/16 v16, 0x10

    mul-long v16, v16, v12

    const-wide/16 v18, 0x400

    move/from16 v20, v10

    move v3, v11

    add-long v10, v16, v18

    .line 198
    invoke-virtual {v1, v10, v11}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v10

    mul-long v12, v12, v14

    const-wide/16 v14, 0x2000

    add-long/2addr v12, v14

    const/4 v11, 0x0

    .line 201
    :try_start_0
    invoke-virtual {v1, v12, v13}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move-object/from16 v13, p0

    .line 202
    :try_start_1
    invoke-static {v13, v9, v0, v1}, Ll/ܳۗ᩸;->ۙ(Ll/᩷ۗ᩸;Ll/᩸ۗ᩸;ILl/ۜܿ᩸;)Ll/ܳۗ᩸;

    move-result-object v11

    .line 203
    invoke-static {v11}, Ll/ܳۗ᩸;->᩷(Ll/ܳۗ᩸;)Ll/᩵ۙᩴ;

    move-result-object v25

    .line 235
    new-instance v9, Ll/۫ۗ᩸;

    .line 490
    new-instance v13, Ljava/io/ByteArrayInputStream;

    iget v4, v4, Ll/᩸ۗ᩸;->᩷:I

    invoke-direct {v13, v2, v4, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v4, v5

    .line 236
    invoke-static {v0, v4, v5, v13}, Ll/ۗܶ᩸;->ۙ(IJLjava/io/InputStream;)Ll/ۗܶ᩸;

    move-result-object v22

    .line 490
    new-instance v4, Ljava/io/ByteArrayInputStream;

    iget v5, v6, Ll/᩸ۗ᩸;->᩷:I

    invoke-direct {v4, v2, v5, v7}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v5, v7

    .line 237
    invoke-static {v0, v5, v6, v4}, Ll/ۡܶ᩸;->ۙ(IJLjava/io/InputStream;)Ll/ۡܶ᩸;

    move-result-object v23

    .line 491
    iget v4, v8, Ll/᩸ۗ᩸;->᩷:I

    iget v5, v8, Ll/᩸ۗ᩸;->ۙ:I

    add-int/2addr v5, v4

    invoke-static {v2, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    .line 238
    invoke-static {v0, v4}, Ll/ۨۤᩴ;->ۙ(I[B)Ll/ۨۤᩴ;

    move-result-object v24

    .line 490
    new-instance v4, Ljava/io/ByteArrayInputStream;

    move/from16 v5, v20

    invoke-direct {v4, v2, v3, v5}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v6, v5

    .line 240
    invoke-static {v4, v6, v7, v0}, Ll/ۗۙᩴ;->ۙ(Ljava/io/ByteArrayInputStream;JI)Ll/ۗۙᩴ;

    move-result-object v26

    .line 241
    invoke-virtual/range {p2 .. p2}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v27

    invoke-virtual/range {p2 .. p2}, Ll/۠ܿ᩸;->length()I

    move-result v29

    add-int v0, v5, v3

    .line 491
    invoke-static {v2, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v33

    const/16 v30, 0x0

    const-wide/16 v31, -0x1

    move-object/from16 v21, v9

    .line 241
    invoke-direct/range {v21 .. v33}, Ll/۫ۗ᩸;-><init>(Ll/ۗܶ᩸;Ll/ۡܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JILjava/util/UUID;J[B)V

    .line 204
    iput-object v10, v9, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    .line 205
    iput-object v11, v9, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v12, :cond_0

    .line 208
    :try_start_2
    invoke-virtual {v12}, Ll/ܿۢ᩸;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v9

    :catchall_0
    move-exception v0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    return-object v9

    :catchall_1
    move-exception v0

    move-object v1, v0

    if-eqz v12, :cond_1

    .line 201
    :try_start_3
    invoke-virtual {v12}, Ll/ܿۢ᩸;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    if-eqz v11, :cond_2

    .line 210
    invoke-virtual {v11}, Ll/ܳۗ᩸;->close()V

    :cond_2
    if-eqz v10, :cond_3

    .line 211
    invoke-virtual {v10}, Ll/ܿۢ᩸;->close()V

    .line 213
    :cond_3
    throw v0

    .line 230
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing fragment recovery state fields"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 227
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Fragment state belongs to another text revision"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 223
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported fragment recovery state"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 220
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment recovery state checksum"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 194
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment recovery state length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/᩻ۢ᩸;Ll/᩺۬᩹;Ll/֡ۢ᩸;I)Ll/۫ۗ᩸;
    .locals 12

    move-object v0, p0

    .line 58
    monitor-enter v0

    .line 59
    :try_start_0
    invoke-virtual {p0}, Ll/᩻ۢ᩸;->ܳ()Ljava/util/UUID;

    move-result-object v7

    .line 60
    invoke-virtual {p0}, Ll/᩻ۢ᩸;->ۤ()J

    move-result-wide v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 61
    :try_start_1
    invoke-virtual {p0}, Ll/᩻ۢ᩸;->ۙ()[B

    move-result-object v1

    invoke-static {v7, v1}, Ll/ۧۤᩴ;->ۙ(Ljava/util/UUID;[B)Ll/ۙᩳ᩸;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    if-eqz v1, :cond_1

    .line 64
    :try_start_2
    invoke-virtual {v1}, Ll/ۙᩳ᩸;->᩷()J

    move-result-wide v2

    int-to-long v4, p3

    cmp-long v6, v2, v4

    if-gtz v6, :cond_0

    .line 65
    invoke-virtual {p0}, Ll/᩻ۢ᩸;->۫()Ll/ۜܿ᩸;

    move-result-object p0

    .line 66
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 67
    :try_start_3
    invoke-virtual {v1}, Ll/ۙᩳ᩸;->᩷()J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {v1}, Ll/ۙᩳ᩸;->᩷()J

    move-result-wide v2

    const-wide/16 v10, 0x20

    add-long/2addr v2, v10

    .line 145
    invoke-virtual {p2, v2, v3}, Ll/֡ۢ᩸;->ۙ(J)Ll/ܿۢ᩸;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 428
    :try_start_4
    new-instance v10, Ll/᩷ۗ᩸;

    new-array v0, v0, [B

    invoke-direct {v10, v0, v2}, Ll/᩷ۗ᩸;-><init>([BLl/ܿۢ᩸;)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 68
    :try_start_5
    invoke-virtual {v10}, Ll/᩷ۗ᩸;->ۙ()[B

    move-result-object v6

    move-object v0, v1

    move-object v1, p1

    move-object v2, v7

    move-wide v3, v4

    move-object v5, p2

    invoke-virtual/range {v0 .. v6}, Ll/ۙᩳ᩸;->ۙ(Ll/᩺۬᩹;Ljava/util/UUID;JLl/֡ۢ᩸;[B)V

    .line 69
    invoke-static {v10, p3, p0}, Ll/۫ۗ᩸;->ۙ(Ll/᩷ۗ᩸;ILl/ۜܿ᩸;)Ll/۫ۗ᩸;

    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 70
    :try_start_6
    invoke-direct {p1, v7, v8, v9}, Ll/۫ۗ᩸;->ۙ(Ljava/util/UUID;J)Ll/۫ۗ᩸;

    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 71
    :try_start_7
    invoke-virtual {p1}, Ll/۫ۗ᩸;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 72
    :try_start_8
    invoke-virtual {v10}, Ll/᩷ۗ᩸;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    invoke-virtual {p0}, Ll/۠ܿ᩸;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    .line 69
    :try_start_9
    invoke-virtual {p1}, Ll/۫ۗ᩸;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_a
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catchall_2
    move-exception p1

    .line 67
    :try_start_b
    invoke-virtual {v10}, Ll/᩷ۗ᩸;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p2

    :try_start_c
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    :catch_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    .line 429
    :goto_2
    invoke-virtual {v2}, Ll/ܿۢ᩸;->close()V

    throw p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :catchall_4
    move-exception p1

    .line 67
    :try_start_d
    invoke-virtual {p0}, Ll/۠ܿ᩸;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1

    .line 64
    :cond_0
    :try_start_e
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Fragment state exceeds recovery limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 63
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Fragment recovery attachment is missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_2
    move-exception p0

    .line 62
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid fragment recovery metadata"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catchall_6
    move-exception p0

    .line 66
    monitor-exit v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    throw p0
.end method

.method public static ۙ(Ll/᩵ۚۤ;)Ll/᩸ۗ᩸;
    .locals 7

    .line 478
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 479
    invoke-virtual {p0}, Ll/᩵ۚۤ;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    int-to-long v1, v0

    .line 480
    invoke-virtual {p0}, Ll/᩵ۚۤ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x4

    sub-long/2addr v3, v5

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 481
    new-instance v1, Ll/᩸ۗ᩸;

    invoke-virtual {p0}, Ll/᩵ۚۤ;->getPosition()J

    move-result-wide v2

    long-to-int v3, v2

    invoke-direct {v1, v3, v0}, Ll/᩸ۗ᩸;-><init>(II)V

    .line 482
    invoke-virtual {p0, v0}, Ll/᩵ۚۤ;->skipBytes(I)V

    return-object v1

    .line 480
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid fragment recovery field length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 478
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Missing fragment recovery field"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic ۙ(Ll/۫ۗ᩸;Ll/ܳۗ᩸;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    return-void
.end method

.method public static bridge synthetic ۙ(Ll/۫ۗ᩸;Ll/ܿۢ᩸;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x0

    .line 346
    iput-object v0, p0, Ll/۫ۗ᩸;->ܰ:Ll/ۗܶ᩸;

    iput-object v0, p0, Ll/۫ۗ᩸;->֡:Ll/ۡܶ᩸;

    iput-object v0, p0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    iput-object v0, p0, Ll/۫ۗ᩸;->ۢ:Ll/᩵ۙᩴ;

    iput-object v0, p0, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    .line 347
    iput-object v0, p0, Ll/۫ۗ᩸;->᩶:[B

    .line 353
    iget-object v1, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    iput-object v0, p0, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    if-eqz v1, :cond_0

    .line 354
    invoke-virtual {v1}, Ll/ܳۗ᩸;->close()V

    .line 355
    :cond_0
    iget-object v1, p0, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    iput-object v0, p0, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    if-eqz v1, :cond_1

    .line 356
    invoke-virtual {v1}, Ll/ܿۢ᩸;->close()V

    :cond_1
    return-void
.end method

.method public final ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;)Ll/ۤۗ᩸;
    .locals 1

    .line 254
    iget-object v0, p0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-direct {p0, p1, p2, p3, v0}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;)Ll/ۤۗ᩸;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;IIZ)Ll/ۤۗ᩸;
    .locals 1

    .line 247
    iget-object v0, p0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v0, p5, p6, p4}, Ll/ۨۤᩴ;->ۙ(IILjava/lang/String;)Ll/ۨۤᩴ;

    move-result-object p4

    if-eqz p7, :cond_0

    .line 248
    invoke-virtual {p1}, Ll/۠ܿ᩸;->length()I

    move-result p5

    invoke-static {p2, p4, p5}, Ll/ܰ᩹᩸;->ۙ(Landroid/os/Bundle;Ll/ۨۤᩴ;I)Ll/ۨۤᩴ;

    move-result-object p4

    .line 249
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;)Ll/ۤۗ᩸;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ljava/lang/String;Z)Ll/ۤۗ᩸;
    .locals 2

    .line 260
    invoke-virtual {p1}, Ll/۠ܿ᩸;->length()I

    move-result v0

    .line 270
    iget-object v1, p0, Ll/۫ۗ᩸;->ۜ:Ll/ۨۤᩴ;

    invoke-virtual {v1, p4}, Ll/ۨۤᩴ;->᩷(Ljava/lang/String;)Ll/ۨۤᩴ;

    move-result-object p4

    if-eqz p5, :cond_0

    .line 271
    invoke-static {p2, p4, v0}, Ll/ܰ᩹᩸;->ۙ(Landroid/os/Bundle;Ll/ۨۤᩴ;I)Ll/ۨۤᩴ;

    move-result-object p4

    .line 260
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll/۫ۗ᩸;->ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;)Ll/ۤۗ᩸;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Ll/ۜܿ᩸;Landroid/os/Bundle;Ll/᩸᩶᩸;Ll/ۨۤᩴ;I)Ll/۫ۗ᩸;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    move/from16 v2, p5

    .line 277
    invoke-static/range {p2 .. p2}, Ll/۫ۗ᩸;->ۙ(Landroid/os/Bundle;)J

    move-result-wide v3

    invoke-virtual/range {p4 .. p4}, Ll/ۨۤᩴ;->ۙ()J

    move-result-wide v5

    add-long/2addr v5, v3

    iget-object v3, v1, Ll/۫ۗ᩸;->᩶:[B

    array-length v3, v3

    int-to-long v3, v3

    add-long/2addr v5, v3

    const-wide/16 v3, 0x1

    add-long/2addr v5, v3

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 278
    :cond_0
    invoke-virtual {v0, v2}, Ll/᩸᩶᩸;->ۙ(I)I

    move-result v0

    :goto_0
    int-to-long v3, v0

    add-long/2addr v5, v3

    const/16 v0, 0x30

    if-lt v2, v0, :cond_3

    const-wide/16 v3, 0x30

    add-long/2addr v3, v5

    .line 279
    iget-object v0, v1, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    invoke-static {v0}, Ll/ܳۗ᩸;->ۙ(Ll/ܳۗ᩸;)[B

    move-result-object v0

    array-length v0, v0

    int-to-long v7, v0

    add-long/2addr v3, v7

    int-to-long v7, v2

    cmp-long v0, v3, v7

    if-gtz v0, :cond_3

    const-wide/16 v3, 0x10

    mul-long v5, v5, v3

    const-wide/16 v3, 0x400

    add-long/2addr v5, v3

    move-object/from16 v0, p1

    .line 282
    invoke-virtual {v0, v5, v6}, Ll/ۜܿ᩸;->᩷(J)Ll/ܿۢ᩸;

    move-result-object v3

    const/4 v4, 0x0

    move-object/from16 v5, p2

    .line 285
    :try_start_0
    invoke-static {v2, v5}, Ll/ۗܶ᩸;->ۙ(ILandroid/os/Bundle;)Ll/ۗܶ᩸;

    move-result-object v6

    .line 286
    iget-object v2, v1, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;

    invoke-virtual {v2}, Ll/ܳۗ᩸;->۠᩷()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3

    .line 287
    :try_start_1
    new-instance v4, Ll/۫ۗ᩸;

    invoke-static {v2}, Ll/ܳۗ᩸;->᩷(Ll/ܳۗ᩸;)Ll/᩵ۙᩴ;

    move-result-object v9

    iget-object v10, v1, Ll/۫ۗ᩸;->۟:Ll/ۗۙᩴ;

    .line 288
    invoke-virtual/range {p1 .. p1}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Ll/۠ܿ᩸;->length()I

    move-result v13

    iget-object v0, v1, Ll/۫ۗ᩸;->᩶:[B

    const/4 v7, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, -0x1

    move-object v5, v4

    move-object/from16 v8, p4

    move-object/from16 v17, v0

    invoke-direct/range {v5 .. v17}, Ll/۫ۗ᩸;-><init>(Ll/ۗܶ᩸;Ll/ۡܶ᩸;Ll/ۨۤᩴ;Ll/᩵ۙᩴ;Ll/ۗۙᩴ;JILjava/util/UUID;J[B)V

    .line 289
    iput-object v3, v4, Ll/۫ۗ᩸;->ܿ:Ll/ܿۢ᩸;

    .line 290
    iput-object v2, v4, Ll/۫ۗ᩸;->ۡ:Ll/ܳۗ᩸;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    :goto_1
    move-object v4, v2

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_2

    :catch_5
    move-exception v0

    :goto_2
    if-eqz v4, :cond_1

    .line 293
    invoke-virtual {v4}, Ll/ܳۗ᩸;->close()V

    :cond_1
    if-eqz v3, :cond_2

    .line 294
    invoke-virtual {v3}, Ll/ܿۢ᩸;->close()V

    .line 295
    :cond_2
    throw v0

    .line 280
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Fragment state exceeds recovery limit"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ()Ll/ᩴۗ᩸;
    .locals 2

    .line 307
    iget-object v0, p0, Ll/۫ۗ᩸;->֨:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 308
    :try_start_0
    new-instance v0, Ll/ᩴۗ᩸;

    iget-object v1, p0, Ll/۫ۗ᩸;->֡:Ll/ۡܶ᩸;

    invoke-virtual {v1}, Ll/ۡܶ᩸;->ۙ()Ll/᩸᩶᩸;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ᩴۗ᩸;-><init>(Ll/۫ۗ᩸;Ll/᩸᩶᩸;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 309
    :goto_0
    invoke-virtual {p0}, Ll/۫ۗ᩸;->close()V

    throw v0

    .line 307
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment state is not bound to a recovery candidate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۙ(Ll/ܽۢ᩸;Ll/᩸᩶᩸;)Ll/ᩴۗ᩸;
    .locals 7

    move-object v0, p1

    .line 83
    monitor-enter v0

    .line 84
    :try_start_0
    invoke-virtual {p1}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 85
    :try_start_1
    invoke-virtual {v1}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v2

    iget-wide v4, p0, Ll/۫ۗ᩸;->۠:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    invoke-virtual {v1}, Ll/۠ܿ᩸;->length()I

    move-result v2

    iget v3, p0, Ll/۫ۗ᩸;->ۖ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v3, :cond_0

    .line 88
    :try_start_2
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V

    .line 89
    invoke-virtual {p1}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Ll/۫ۗ᩸;->ۙ(Ljava/util/UUID;J)Ll/۫ۗ᩸;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 90
    :try_start_3
    new-instance v1, Ll/ᩴۗ᩸;

    invoke-direct {v1, p1, p2}, Ll/ᩴۗ᩸;-><init>(Ll/۫ۗ᩸;Ll/᩸᩶᩸;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    monitor-exit v0

    return-object v1

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    .line 91
    :goto_0
    invoke-virtual {p1}, Ll/۫ۗ᩸;->close()V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 86
    :cond_0
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Migrated fragment text no longer matches"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    .line 84
    :try_start_6
    invoke-virtual {v1}, Ll/۠ܿ᩸;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_7
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    :catchall_2
    move-exception p1

    .line 92
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public final ۙ(Ll/ܽۢ᩸;)V
    .locals 6

    move-object v0, p1

    .line 314
    monitor-enter v0

    .line 315
    :try_start_0
    iget-object v1, p0, Ll/۫ۗ᩸;->֨:Ljava/util/UUID;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ll/ܽۢ᩸;->۬()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, p0, Ll/۫ۗ᩸;->ᩳ:J

    invoke-virtual {p1}, Ll/ܽۢ᩸;->۠()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 318
    invoke-virtual {p1}, Ll/ܽۢ᩸;->᩷ۙ()Ll/ۜܿ᩸;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 319
    :try_start_1
    invoke-virtual {p1}, Ll/ۜܿ᩸;->۫()J

    move-result-wide v1

    iget-wide v3, p0, Ll/۫ۗ᩸;->۠:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-virtual {p1}, Ll/۠ܿ᩸;->length()I

    move-result v1

    iget v2, p0, Ll/۫ۗ᩸;->ۖ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v1, v2, :cond_0

    .line 322
    :try_start_2
    invoke-virtual {p1}, Ll/۠ܿ᩸;->close()V

    .line 323
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-void

    .line 320
    :cond_0
    :try_start_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment recovery text no longer matches"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v1

    .line 318
    :try_start_4
    invoke-virtual {p1}, Ll/۠ܿ᩸;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 316
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment recovery candidate is no longer current"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    .line 323
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1
.end method

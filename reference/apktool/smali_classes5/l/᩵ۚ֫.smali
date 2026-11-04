.class public final Ll/᩵ۚ֫;
.super Ll/ۖ֨ܺ;
.source "X8H6"


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ۤ:Ljava/lang/String;

.field public final ᩷:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;[BLjava/lang/String;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    iput-object p2, p0, Ll/᩵ۚ֫;->᩷:[B

    return-void
.end method

.method public static ۙ(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)Ll/᩵ۚ֫;
    .locals 20

    move-object/from16 v6, p0

    const-wide/16 v7, 0xc

    cmp-long v0, p1, v7

    if-gez v0, :cond_0

    goto/16 :goto_8

    :cond_0
    const/16 v0, 0xc

    new-array v9, v0, [B

    const/4 v4, 0x0

    const/16 v5, 0xc

    const-wide/16 v1, 0x0

    move-object/from16 v0, p0

    move-object v3, v9

    .line 43
    invoke-static/range {v0 .. v5}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    const-string v0, "RIFF"

    const/4 v10, 0x0

    .line 44
    invoke-static {v0, v10, v9}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v0

    if-eqz v0, :cond_17

    const/16 v0, 0x8

    const-string v1, "WAVE"

    invoke-static {v1, v0, v9}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_8

    :cond_1
    const/4 v11, 0x4

    .line 18
    invoke-static {v11, v9}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v0

    int-to-long v0, v0

    const-wide v12, 0xffffffffL

    and-long/2addr v0, v12

    const-wide/16 v2, 0x4

    cmp-long v4, v0, v2

    if-ltz v4, :cond_16

    const-wide/16 v14, 0x8

    sub-long v2, p1, v14

    cmp-long v4, v0, v2

    if-gtz v4, :cond_16

    add-long v16, v0, v14

    const/4 v0, 0x0

    move-wide/from16 v18, v7

    const/4 v7, 0x0

    :goto_0
    cmp-long v0, v18, v16

    if-gez v0, :cond_17

    const/16 v0, 0x400

    if-ge v7, v0, :cond_15

    sub-long v0, v16, v18

    cmp-long v2, v0, v14

    if-ltz v2, :cond_15

    const/4 v4, 0x0

    const/16 v5, 0x8

    move-object/from16 v0, p0

    move-wide/from16 v1, v18

    move-object v3, v9

    .line 51
    invoke-static/range {v0 .. v5}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;J[BII)V

    .line 18
    invoke-static {v11, v9}, Ll/ۜۚܺ;->ۙ(I[B)I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x0

    and-long v3, v0, v12

    add-long v11, v18, v14

    sub-long v18, v16, v11

    cmp-long v8, v3, v18

    if-gtz v8, :cond_14

    const-string v8, "id3 "

    .line 55
    invoke-static {v8, v10, v9}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "ID3 "

    invoke-static {v8, v10, v9}, Ll/ۛ۠ۚ;->ۙ(Ljava/lang/String;I[B)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v18, 0x1

    and-long v0, v0, v18

    add-long/2addr v3, v0

    add-long v18, v11, v3

    cmp-long v0, v18, v16

    if-gtz v0, :cond_3

    add-int/lit8 v7, v7, 0x1

    const/4 v11, 0x4

    const-wide v12, 0xffffffffL

    goto :goto_0

    .line 60
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WAV chunk padding"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_4
    :goto_1
    invoke-static {v6, v11, v12, v3, v4}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;JJ)Ll/ۗ۠ۚ;

    move-result-object v0

    if-nez v0, :cond_5

    goto/16 :goto_9

    .line 70
    :cond_5
    new-instance v1, Ll/ۗۚ֫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v6, v0, v1}, Ll/ۛ۠ۚ;->ۙ(Ll/ۨ۠ۚ;Ll/ۗ۠ۚ;Ll/ܿ᩻᩷;)Ll/ᩳ᩹ۙ;

    move-result-object v0

    if-nez v0, :cond_6

    goto/16 :goto_9

    :cond_6
    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    const/4 v6, 0x0

    .line 75
    :goto_2
    invoke-virtual {v0}, Ll/ᩳ᩹ۙ;->ۙ()I

    move-result v7

    if-ge v1, v7, :cond_12

    .line 76
    invoke-virtual {v0, v1}, Ll/ᩳ᩹ۙ;->ۙ(I)Ll/۟᩹ۙ;

    move-result-object v7

    .line 77
    instance-of v8, v7, Ll/۠᩻᩷;

    const/4 v9, 0x3

    if-eqz v8, :cond_d

    move-object v8, v7

    check-cast v8, Ll/۠᩻᩷;

    iget-object v11, v8, Ll/۠᩻᩷;->ۤ:Ll/֫۫ܽ;

    invoke-virtual {v11}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_d

    .line 78
    iget-object v7, v8, Ll/ᩳ᩻᩷;->ۙ:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    goto :goto_3

    :sswitch_0
    const-string v8, "TPE2"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    const/4 v9, 0x5

    goto :goto_4

    :sswitch_1
    const-string v8, "TPE1"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    const/4 v9, 0x4

    goto :goto_4

    :sswitch_2
    const-string v8, "TIT2"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_3

    :sswitch_3
    const-string v8, "TT2"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_3

    :cond_9
    const/4 v9, 0x2

    goto :goto_4

    :sswitch_4
    const-string v8, "TP2"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_3

    :cond_a
    const/4 v9, 0x1

    goto :goto_4

    :sswitch_5
    const-string v8, "TP1"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_3

    :cond_b
    const/4 v9, 0x0

    goto :goto_4

    :goto_3
    const/4 v9, -0x1

    :cond_c
    :goto_4
    packed-switch v9, :pswitch_data_0

    goto :goto_6

    .line 79
    :pswitch_0
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    goto :goto_6

    .line 81
    :pswitch_1
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_6

    .line 80
    :pswitch_2
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_6

    .line 83
    :cond_d
    instance-of v8, v7, Ll/ۨ᩻᩷;

    if-eqz v8, :cond_10

    check-cast v7, Ll/ۨ᩻᩷;

    iget v8, v7, Ll/ۨ᩻᩷;->ᩴ:I

    iget-object v11, v7, Ll/ۨ᩻᩷;->ۤ:Ljava/lang/String;

    iget-object v7, v7, Ll/ۨ᩻᩷;->᩸:[B

    array-length v12, v7

    if-lez v12, :cond_10

    const-string v12, "-->"

    .line 85
    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    const-string v12, "image/-->"

    invoke-virtual {v12, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    if-eqz v4, :cond_e

    if-nez v6, :cond_10

    if-ne v8, v9, :cond_10

    :cond_e
    move-object/from16 v11, p3

    .line 87
    invoke-interface {v11, v7}, Ljava/util/function/Predicate;->test(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    if-ne v8, v9, :cond_f

    const/4 v4, 0x1

    goto :goto_5

    :cond_f
    const/4 v4, 0x0

    :goto_5
    move v6, v4

    move-object v4, v7

    goto :goto_7

    :cond_10
    :goto_6
    move-object/from16 v11, p3

    :cond_11
    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_2

    .line 92
    :cond_12
    new-instance v0, Ll/᩵ۚ֫;

    if-nez v2, :cond_13

    move-object v2, v3

    :cond_13
    invoke-direct {v0, v5, v4, v2}, Ll/᩵ۚ֫;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    return-object v0

    .line 54
    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated WAV chunk"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 50
    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WAV chunk list"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_16
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid WAV RIFF size"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_8
    const/4 v2, 0x0

    :goto_9
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x14535 -> :sswitch_5
        0x14536 -> :sswitch_4
        0x145b2 -> :sswitch_3
        0x274b93 -> :sswitch_2
        0x276408 -> :sswitch_1
        0x276409 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ۙ(Ll/۬ܺۤ;)Ll/᩵ۚ֫;
    .locals 4

    .line 28
    :try_start_0
    new-instance v0, Ll/ܶۚ֫;

    invoke-direct {v0, p0}, Ll/ܶۚ֫;-><init>(Ljava/lang/Object;)V

    .line 31
    invoke-virtual {p0}, Ll/۬ܺۤ;->length()J

    move-result-wide v1

    new-instance p0, Ll/᩹ۚ֫;

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Ll/᩹ۚ֫;-><init>(I)V

    .line 28
    invoke-static {v0, v1, v2, p0}, Ll/᩵ۚ֫;->ۙ(Ll/ۨ۠ۚ;JLjava/util/function/Predicate;)Ll/᩵ۚ֫;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 21
    instance-of v0, p1, Ll/᩵ۚ֫;

    if-eqz v0, :cond_0

    check-cast p1, Ll/᩵ۚ֫;

    iget-object v0, p0, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    iget-object v1, p1, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    iget-object v1, p1, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    invoke-static {v0, v1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩵ۚ֫;->᩷:[B

    iget-object p1, p1, Ll/᩵ۚ֫;->᩷:[B

    invoke-static {v0, p1}, Ll/ܽۚۗ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 21
    iget-object v0, p0, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    invoke-static {v0}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/lit8 v0, v0, 0x1f

    .line 0
    iget-object v2, p0, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ll/᩻ۢ᩹;->ۙ(IILjava/lang/String;)I

    move-result v0

    .line 21
    iget-object v1, p0, Ll/᩵ۚ֫;->᩷:[B

    invoke-static {v1}, Ll/ܽۚۗ;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 21
    iget-object v2, p0, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v2, 0x1

    iget-object v3, p0, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    aput-object v3, v0, v2

    const/4 v3, 0x2

    iget-object v4, p0, Ll/᩵ۚ֫;->᩷:[B

    aput-object v4, v0, v3

    const-string v3, "title;author;image"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    new-array v3, v1, [Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v4, ";"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "WavID3Info["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_1
    array-length v5, v3

    if-ge v1, v5, :cond_2

    aget-object v5, v3, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v5, v0, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    array-length v5, v3

    sub-int/2addr v5, v2

    if-eq v1, v5, :cond_1

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/᩵ۚ֫;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۤ()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Ll/᩵ۚ֫;->ۤ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()[B
    .locals 1

    .line 21
    iget-object v0, p0, Ll/᩵ۚ֫;->᩷:[B

    return-object v0
.end method

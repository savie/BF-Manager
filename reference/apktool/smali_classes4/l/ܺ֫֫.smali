.class public final Ll/ܺ֫֫;
.super Ljava/lang/Object;
.source "B6MB"


# direct methods
.method public static ۙ(F)I
    .locals 2

    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 589
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x49742400    # 1000000.0f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-double v0, p0

    .line 591
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    const/4 v0, 0x1

    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0

    .line 590
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Image has no finite dimensions"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(I[B)I
    .locals 1

    .line 623
    aget-byte v0, p1, p0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 p0, p0, 0x1

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x8

    or-int/2addr p0, v0

    return p0
.end method

.method public static synthetic ۙ(Ll/᩺ۧ֫;Ll/۫ۧ֫;Ll/ۜ֫֫;)Landroid/graphics/BitmapFactory$Options;
    .locals 0

    .line 88
    invoke-static {p0}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 89
    invoke-static {p1, p2}, Ll/۬֫֫;->᩷(Ll/۫ۧ֫;Ll/ۜ֫֫;)Landroid/graphics/BitmapFactory$Options;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;
    .locals 0

    .line 608
    invoke-virtual {p0, p1, p2}, Ll/ۖۚ֫;->ۙ(J)Ll/ۡۚ֫;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    .line 609
    :cond_0
    new-instance p0, Ll/ᩳ֫֫;

    const-string p1, "Special image reservation exceeds budget"

    .line 459
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 609
    throw p0
.end method

.method public static ۙ(Ll/᩷֫֫;Ll/ۘۧ֫;)Ll/۫֫֫;
    .locals 51

    move-object/from16 v0, p0

    const-string v1, "opacity"

    .line 343
    :try_start_0
    invoke-static {}, Landroid/util/Xml;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v2

    const-string v3, "http://xmlpull.org/v1/doc/features.html#process-docdecl"

    const/4 v4, 0x0

    .line 344
    invoke-interface {v2, v3, v4}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    const-string v3, "http://xmlpull.org/v1/doc/features.html#process-namespaces"

    const/4 v5, 0x1

    .line 345
    invoke-interface {v2, v3, v5}, Lorg/xmlpull/v1/XmlPullParser;->setFeature(Ljava/lang/String;Z)V

    .line 346
    new-instance v3, Ljava/io/ByteArrayInputStream;

    iget-object v6, v0, Ll/᩷֫֫;->ܰ:[B

    iget v0, v0, Ll/᩷֫֫;->ܿ:I

    invoke-direct {v3, v6, v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    const/4 v0, 0x0

    invoke-interface {v2, v3, v0}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 348
    new-instance v6, Ll/ۚ֫֫;

    invoke-direct {v6, v4}, Ll/ۚ֫֫;-><init>(I)V

    .line 349
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 350
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 351
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 355
    invoke-virtual {v0, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 356
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x1

    move-wide/from16 v21, v19

    const/4 v12, 0x0

    const/16 v23, 0x1

    move-wide/from16 v19, v17

    move-wide/from16 v17, v15

    move-wide v15, v13

    const/4 v14, 0x0

    :goto_0
    const/4 v11, 0x2

    if-eq v8, v5, :cond_45

    .line 357
    invoke-static/range {p1 .. p1}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    const/16 v5, 0xa

    if-ne v8, v5, :cond_1

    .line 359
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    const-string v13, "<!ENTITY"

    invoke-virtual {v5, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 360
    :cond_0
    new-instance v0, Ll/֫֫֫;

    const-string v1, "SVG entity declarations are not supported"

    .line 483
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 360
    throw v0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    const-wide/32 v24, 0x100000

    if-ne v8, v11, :cond_3e

    const-string v5, "http://www.w3.org/2000/svg"

    if-nez v14, :cond_3

    .line 364
    :try_start_1
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v8

    const-string v11, "svg"

    .line 365
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_3

    .line 366
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    .line 367
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Image XML root is not SVG"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_2
    add-int/lit8 v14, v14, 0x1

    const/16 v8, 0x2000

    if-gt v14, v8, :cond_3d

    add-int/lit8 v9, v9, 0x1

    const/16 v8, 0x40

    if-gt v9, v8, :cond_3d

    .line 370
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v8

    .line 371
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getNamespace()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 372
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_5

    .line 373
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    goto :goto_4

    :cond_5
    :goto_3
    const/4 v5, 0x1

    :goto_4
    if-nez v10, :cond_3c

    if-eqz v5, :cond_6

    .line 375
    invoke-static {v8}, Ll/ۜۜܺ;->ۤ(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_6

    goto/16 :goto_1d

    :cond_6
    if-nez v5, :cond_7

    .line 379
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚ֫֫;

    invoke-virtual {v0, v4}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    move-object/from16 v33, v0

    move-object/from16 v35, v1

    move-object v0, v3

    move-object/from16 v29, v6

    goto/16 :goto_20

    :cond_7
    const-string v5, "image"

    .line 380
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v23, 0x0

    .line 384
    :cond_8
    new-instance v11, Ll/ۚ֫֫;

    invoke-direct {v11, v4}, Ll/ۚ֫֫;-><init>(I)V

    iget-object v4, v11, Ll/ۚ֫֫;->ܳ:Ljava/util/ArrayList;

    const-string v13, "defs"

    .line 385
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0

    move/from16 p0, v9

    const-string v9, "radialGradient"

    move/from16 v26, v14

    const-string v14, "linearGradient"

    move-wide/from16 v27, v15

    const-string v15, "pattern"

    move/from16 v16, v12

    const-string v12, "mask"

    if-nez v13, :cond_a

    :try_start_2
    const-string v13, "symbol"

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    const-string v13, "marker"

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    const-string v13, "clipPath"

    .line 386
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    const-string v13, "view"

    .line 387
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_5

    :cond_9
    const/4 v13, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v13, 0x1

    :goto_6
    iput-boolean v13, v11, Ll/ۚ֫֫;->ۤ:Z

    const-string v13, "title"

    .line 388
    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v29, v6

    const-string v6, "style"

    if-nez v13, :cond_c

    :try_start_3
    const-string v13, "desc"

    invoke-virtual {v13, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    goto :goto_7

    :cond_b
    const/4 v13, 0x0

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v13, 0x1

    .line 390
    :goto_8
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_d

    const/16 v16, 0x1

    .line 391
    :cond_d
    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_0

    move/from16 v31, v10

    const-string v10, "filter"

    if-nez v30, :cond_e

    :try_start_4
    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-nez v30, :cond_e

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-nez v30, :cond_e

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_f

    :cond_e
    const/16 v23, 0x0

    .line 393
    :cond_f
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v30

    move-object/from16 v32, v3

    move-object/from16 v3, v30

    check-cast v3, Ll/ۚ֫֫;

    iget-object v3, v3, Ll/ۚ֫֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 394
    invoke-virtual {v0, v11}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    const/4 v3, 0x0

    const/16 v30, 0x0

    const/16 v33, 0x0

    move-object/from16 v33, v0

    move-object/from16 v34, v4

    const/4 v0, 0x0

    move/from16 v49, v23

    move-object/from16 v23, v14

    move-object/from16 v50, v30

    move-object/from16 v30, v15

    move-wide/from16 v14, v19

    move/from16 v19, v49

    move-object/from16 v20, v50

    .line 395
    :goto_9
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v4

    if-ge v0, v4, :cond_3a

    .line 396
    invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v35

    move-object/from16 v36, v9

    invoke-virtual/range {v35 .. v35}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    move-object/from16 v35, v8

    .line 397
    invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeNamespace(I)Ljava/lang/String;

    move-result-object v8
    :try_end_4
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v37, v7

    const-string v7, "http://www.w3.org/1999/xlink"

    move/from16 v38, v3

    const-string v3, "href"

    if-eqz v5, :cond_11

    .line 398
    :try_start_5
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_11

    if-eqz v8, :cond_10

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v39

    if-nez v39, :cond_10

    .line 399
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v39

    if-eqz v39, :cond_11

    .line 402
    :cond_10
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    add-long v21, v21, v3

    .line 403
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v3

    int-to-long v3, v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move-wide/from16 v44, v3

    move/from16 v41, v5

    move-object/from16 v20, v9

    move/from16 v48, v13

    move-object/from16 v5, v23

    move-object/from16 v3, v34

    move-object/from16 v14, v35

    move-object/from16 v15, v36

    move-object/from16 v7, v37

    move-object/from16 v35, v1

    goto/16 :goto_1b

    :cond_11
    move-object/from16 v40, v7

    move-object/from16 v39, v8

    .line 406
    iget-wide v7, v11, Ll/ۚ֫֫;->ۙ:J

    move/from16 v41, v5

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    move-object/from16 v42, v2

    move-object/from16 v43, v3

    int-to-long v2, v5

    add-long/2addr v7, v2

    iput-wide v7, v11, Ll/ۚ֫֫;->ۙ:J

    .line 407
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    int-to-long v2, v2

    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    const-string v5, "d"

    .line 408
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    const-string v5, "points"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_a

    .line 413
    :cond_12
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v7, v5

    add-long v17, v17, v7

    move-wide/from16 v44, v2

    move/from16 v48, v13

    goto/16 :goto_f

    :cond_13
    :goto_a
    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v14, 0x0

    move-wide/from16 v44, v2

    .line 496
    :goto_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_22

    .line 497
    invoke-virtual {v9, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    const-wide/16 v46, 0x1

    move/from16 v48, v13

    const/16 v13, 0x2e

    if-lt v2, v3, :cond_14

    const/16 v3, 0x39

    if-le v2, v3, :cond_15

    :cond_14
    if-ne v2, v13, :cond_18

    :cond_15
    if-eqz v7, :cond_16

    if-ne v2, v13, :cond_17

    if-eqz v8, :cond_17

    :cond_16
    add-long v14, v14, v46

    :cond_17
    if-ne v2, v13, :cond_21

    const/4 v8, 0x1

    goto :goto_d

    :cond_18
    const/16 v3, 0x2d

    const/16 v13, 0x65

    if-eq v2, v3, :cond_1f

    const/16 v3, 0x2b

    if-ne v2, v3, :cond_19

    goto :goto_c

    :cond_19
    if-eq v2, v13, :cond_1a

    const/16 v3, 0x45

    if-ne v2, v3, :cond_1b

    :cond_1a
    if-eqz v7, :cond_1b

    goto :goto_e

    :cond_1b
    const/16 v3, 0x41

    if-lt v2, v3, :cond_1c

    const/16 v3, 0x5a

    if-le v2, v3, :cond_1d

    :cond_1c
    const/16 v3, 0x61

    if-lt v2, v3, :cond_1e

    const/16 v3, 0x7a

    if-gt v2, v3, :cond_1e

    :cond_1d
    add-long v14, v14, v46

    :cond_1e
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    goto :goto_e

    :cond_1f
    :goto_c
    if-eqz v5, :cond_20

    add-int/lit8 v2, v5, -0x1

    .line 503
    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v3, v13, :cond_21

    invoke-virtual {v9, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x45

    if-eq v2, v3, :cond_21

    :cond_20
    add-long v14, v14, v46

    const/4 v8, 0x0

    :cond_21
    :goto_d
    const/4 v2, 0x1

    const/4 v7, 0x1

    :goto_e
    add-int/lit8 v5, v5, 0x1

    move/from16 v13, v48

    goto :goto_b

    :cond_22
    move/from16 v48, v13

    add-long v27, v27, v14

    .line 411
    iget-wide v2, v11, Ll/ۚ֫֫;->᩸:J

    add-long/2addr v2, v14

    iput-wide v2, v11, Ll/ۚ֫֫;->᩸:J

    :goto_f
    const-wide/32 v2, 0x40000

    cmp-long v5, v27, v2

    if-gtz v5, :cond_39

    cmp-long v2, v17, v24

    if-gtz v2, :cond_39

    .line 416
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-static {v9}, Ll/ۜۜܺ;->᩸(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_23

    .line 417
    iget v2, v11, Ll/ۚ֫֫;->ᩴ:I

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iput v2, v11, Ll/ۚ֫֫;->ᩴ:I

    .line 418
    :cond_23
    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_24

    const-string v2, "none"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    const/4 v2, 0x3

    iput v2, v11, Ll/ۚ֫֫;->ᩴ:I

    .line 420
    :cond_24
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_25

    invoke-virtual {v9, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_26

    :cond_25
    const/16 v16, 0x1

    .line 421
    :cond_26
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    .line 422
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_28

    invoke-virtual {v9, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_28

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_27

    goto :goto_10

    :cond_27
    move-object/from16 v2, v42

    goto :goto_11

    :cond_28
    :goto_10
    const/4 v2, 0x0

    move-object/from16 v2, v42

    const/16 v19, 0x0

    .line 424
    :goto_11
    invoke-interface {v2, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributePrefix(I)Ljava/lang/String;

    move-result-object v3
    :try_end_5
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_5 .. :try_end_5} :catch_0

    if-nez v48, :cond_2c

    if-nez v38, :cond_2c

    const-string v5, "xml"

    if-eqz v3, :cond_29

    .line 425
    :try_start_6
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_29

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2c

    :cond_29
    const-string v7, "id"

    .line 426
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2a

    move-object/from16 v7, v37

    .line 428
    invoke-virtual {v7, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2b

    invoke-virtual {v7, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_12

    :cond_2a
    move-object/from16 v7, v37

    .line 430
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    const-string v3, "space"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2d

    :cond_2b
    :goto_12
    const/4 v3, 0x1

    goto :goto_13

    :cond_2c
    move-object/from16 v7, v37

    :cond_2d
    move/from16 v3, v38

    :goto_13
    move-object/from16 v5, v43

    .line 432
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_6
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_6 .. :try_end_6} :catch_0

    const-string v8, "SVG external resources are not supported"

    const-string v13, "#"

    if-eqz v5, :cond_34

    :try_start_7
    const-string v5, "use"

    move-object/from16 v14, v35

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_31

    const-string v5, "tref"

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_31

    const-string v5, "textPath"

    .line 433
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_31

    move-object/from16 v5, v23

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_30

    move-object/from16 v15, v36

    .line 434
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-nez v23, :cond_2f

    move-object/from16 v35, v1

    move-object/from16 v1, v30

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_2e

    goto :goto_15

    :cond_2e
    move-object/from16 v30, v1

    goto :goto_17

    :cond_2f
    move-object/from16 v35, v1

    move-object/from16 v1, v30

    goto :goto_15

    :cond_30
    move-object/from16 v35, v1

    goto :goto_14

    :cond_31
    move-object/from16 v35, v1

    move-object/from16 v5, v23

    :goto_14
    move-object/from16 v1, v30

    move-object/from16 v15, v36

    :goto_15
    if-eqz v39, :cond_32

    .line 435
    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->isEmpty()Z

    move-result v23

    if-nez v23, :cond_32

    move-object/from16 v30, v1

    move/from16 v23, v3

    move-object/from16 v1, v39

    move-object/from16 v3, v40

    .line 436
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_35

    goto :goto_16

    :cond_32
    move-object/from16 v30, v1

    move/from16 v23, v3

    .line 437
    :goto_16
    invoke-static {v9}, Ll/ۜۜܺ;->ᩴ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 438
    invoke-virtual {v1, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_33

    const/4 v3, 0x1

    .line 439
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v34

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 438
    :cond_33
    new-instance v0, Ll/֫֫֫;

    .line 483
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 438
    throw v0

    :cond_34
    move-object/from16 v5, v23

    move-object/from16 v14, v35

    move-object/from16 v15, v36

    move-object/from16 v35, v1

    :goto_17
    move/from16 v23, v3

    :cond_35
    move-object/from16 v3, v34

    :goto_18
    if-eqz v48, :cond_36

    goto :goto_1a

    .line 444
    :cond_36
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 445
    invoke-static {v4, v9, v3}, Ll/ۜۜܺ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 446
    :goto_19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_38

    .line 447
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 448
    invoke-virtual {v4, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_37

    const/4 v9, 0x1

    .line 449
    invoke-virtual {v4, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_19

    .line 448
    :cond_37
    new-instance v0, Ll/֫֫֫;

    .line 483
    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 448
    throw v0

    :cond_38
    :goto_1a
    move/from16 v38, v23

    :goto_1b
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v34, v3

    move-object/from16 v23, v5

    move-object v8, v14

    move-object v9, v15

    move-object/from16 v1, v35

    move/from16 v3, v38

    move/from16 v5, v41

    move-wide/from16 v14, v44

    move/from16 v13, v48

    goto/16 :goto_9

    .line 415
    :cond_39
    new-instance v0, Ll/᩸֫֫;

    const-string v1, "SVG data exceeds safe parse limits"

    .line 488
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 415
    throw v0

    :cond_3a
    move-object/from16 v35, v1

    if-eqz v20, :cond_3b

    .line 453
    invoke-static/range {v20 .. v20}, Ll/ۛ᩻֫;->᩷(Ljava/lang/String;)I

    move-object/from16 v1, v20

    move-object/from16 v0, v32

    .line 454
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1c

    :cond_3b
    move-object/from16 v0, v32

    :goto_1c
    move/from16 v12, v16

    move/from16 v23, v19

    move/from16 v10, v31

    move-wide/from16 v19, v14

    goto :goto_1e

    :cond_3c
    :goto_1d
    move-object/from16 v33, v0

    move-object/from16 v35, v1

    move-object v0, v3

    move-object/from16 v29, v6

    move/from16 p0, v9

    move/from16 v31, v10

    move/from16 v26, v14

    move-wide/from16 v27, v15

    move/from16 v16, v12

    add-int/lit8 v10, v31, 0x1

    move/from16 v12, v16

    :goto_1e
    move-wide/from16 v15, v27

    move/from16 v9, p0

    move/from16 v14, v26

    goto/16 :goto_20

    .line 369
    :cond_3d
    new-instance v0, Ll/᩸֫֫;

    const-string v1, "SVG structure exceeds safe render limits"

    .line 488
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 369
    throw v0

    :cond_3e
    move-object/from16 v33, v0

    move-object/from16 v35, v1

    move-object v0, v3

    move-object/from16 v29, v6

    move/from16 v31, v10

    move-wide/from16 v27, v15

    move/from16 v16, v12

    const/4 v1, 0x3

    if-ne v8, v1, :cond_40

    add-int/lit8 v9, v9, -0x1

    if-lez v31, :cond_3f

    add-int/lit8 v10, v31, -0x1

    move/from16 v12, v16

    move-wide/from16 v15, v27

    goto :goto_20

    .line 458
    :cond_3f
    invoke-virtual/range {v33 .. v33}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    goto :goto_1f

    :cond_40
    if-nez v31, :cond_44

    if-lez v14, :cond_44

    const/4 v1, 0x4

    if-eq v8, v1, :cond_41

    const/4 v1, 0x5

    if-ne v8, v1, :cond_44

    .line 461
    :cond_41
    invoke-virtual/range {v33 .. v33}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֫֫;

    iget-wide v3, v1, Ll/ۚ֫֫;->ۙ:J

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, v1, Ll/ۚ֫֫;->ۙ:J

    .line 462
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->isWhitespace()Z

    move-result v1

    if-nez v1, :cond_42

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    int-to-long v3, v1

    add-long v17, v17, v3

    :cond_42
    cmp-long v1, v17, v24

    if-gtz v1, :cond_43

    goto :goto_1f

    .line 463
    :cond_43
    new-instance v0, Ll/᩸֫֫;

    const-string v1, "SVG text exceeds safe parse limits"

    .line 488
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 463
    throw v0

    :cond_44
    :goto_1f
    move/from16 v12, v16

    move-wide/from16 v15, v27

    move/from16 v10, v31

    .line 356
    :goto_20
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->nextToken()I

    move-result v8

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v3, v0

    move-object/from16 v6, v29

    move-object/from16 v0, v33

    move-object/from16 v1, v35

    goto/16 :goto_0

    :cond_45
    move-object v0, v3

    move-object/from16 v29, v6

    move-wide/from16 v27, v15

    move/from16 v16, v12

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v14, :cond_47

    const/4 v3, 0x5

    new-array v3, v3, [J

    .line 468
    fill-array-data v3, :array_0

    .line 469
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    const/4 v4, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v6, v29

    move-object v9, v3

    move/from16 v12, v16

    move-object/from16 v13, p1

    invoke-static/range {v6 .. v13}, Ll/ܺ֫֫;->ۙ(Ll/ۚ֫֫;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۘۧ֫;)V

    int-to-long v5, v14

    const-wide/16 v7, 0x200

    mul-long v5, v5, v7

    const-wide/32 v7, 0x10000

    add-long/2addr v5, v7

    const-wide/16 v7, 0x20

    mul-long v15, v27, v7

    add-long/2addr v15, v5

    const-wide/16 v5, 0x2

    mul-long v17, v17, v5

    add-long v17, v17, v15

    mul-long v19, v19, v5

    add-long v19, v19, v17

    const-wide/16 v5, 0x4

    mul-long v21, v21, v5

    add-long v13, v21, v19

    .line 474
    new-instance v5, Ll/۫֫֫;

    aget-wide v6, v3, v1

    long-to-int v1, v6

    const/4 v6, 0x1

    add-int/lit8 v9, v1, 0x1

    aget-wide v1, v3, v2

    long-to-int v10, v1

    aget-wide v11, v3, v4

    if-eqz v23, :cond_46

    const-wide/16 v7, 0x80

    cmp-long v4, v1, v7

    if-gtz v4, :cond_46

    aget-wide v1, v3, v6

    const-wide/16 v3, 0x10

    cmp-long v6, v1, v3

    if-gtz v6, :cond_46

    const-wide/16 v1, 0x4000

    cmp-long v3, v11, v1

    if-gtz v3, :cond_46

    const/4 v1, 0x1

    const/4 v15, 0x1

    goto :goto_21

    :cond_46
    const/4 v1, 0x0

    const/4 v15, 0x0

    :goto_21
    move-object v8, v5

    move-object/from16 v16, v0

    invoke-direct/range {v8 .. v16}, Ll/۫֫֫;-><init>(IIJJZLjava/util/LinkedHashSet;)V

    return-object v5

    .line 466
    :cond_47
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SVG root element is missing"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    move-exception v0

    .line 477
    new-instance v1, Ljava/io/IOException;

    const-string v2, "SVG XML could not be parsed"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :array_0
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/᩷֫֫;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ܳ֫֫;
    .locals 23

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-wide/from16 v2, p4

    move-object/from16 v4, p6

    .line 260
    invoke-static {v0, v4}, Ll/ܺ֫֫;->ۙ(Ll/᩷֫֫;Ll/ۘۧ֫;)Ll/۫֫֫;

    move-result-object v5

    iget-object v6, v5, Ll/۫֫֫;->ۤ:Ljava/util/LinkedHashSet;

    .line 262
    iget-wide v7, v5, Ll/۫֫֫;->ܳ:J

    .line 263
    invoke-static {v1, v7, v8}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v7

    .line 272
    :try_start_0
    iget v8, v5, Ll/۫֫֫;->᩸:I

    add-int/lit8 v9, v8, -0x1

    .line 273
    new-instance v10, Ljava/io/ByteArrayInputStream;

    iget-object v11, v0, Ll/᩷֫֫;->ܰ:[B

    iget v0, v0, Ll/᩷֫֫;->ܿ:I

    const/4 v12, 0x0

    invoke-direct {v10, v11, v12, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    invoke-static {v10}, Ll/֫ۜܺ;->ۙ(Ljava/io/InputStream;)Ll/֫ۜܺ;

    move-result-object v10

    .line 274
    invoke-static/range {p6 .. p6}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 275
    invoke-virtual {v10}, Ll/֫ۜܺ;->ۤ()Landroid/graphics/RectF;

    move-result-object v0

    .line 276
    invoke-virtual {v10}, Ll/֫ۜܺ;->᩸()F

    move-result v11

    invoke-virtual {v10}, Ll/֫ۜܺ;->᩷()F

    move-result v12

    const/4 v13, 0x0

    cmpl-float v14, v11, v13

    if-gtz v14, :cond_0

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v11

    :cond_0
    cmpl-float v13, v12, v13

    if-gtz v13, :cond_1

    if-eqz v0, :cond_1

    .line 278
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v12

    .line 279
    :cond_1
    invoke-static {v11}, Ll/ܺ֫֫;->ۙ(F)I

    move-result v11

    invoke-static {v12}, Ll/ܺ֫֫;->ۙ(F)I

    move-result v12

    .line 280
    sget-object v13, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    invoke-virtual {v13, v11, v12}, Ll/ۜ֫֫;->ۙ(II)V

    if-nez v0, :cond_2

    int-to-float v0, v11

    int-to-float v13, v12

    .line 281
    invoke-virtual {v10, v0, v13}, Ll/֫ۜܺ;->ۙ(FF)V

    .line 284
    :cond_2
    invoke-static {v10}, Ll/ۜۜܺ;->ۙ(Ll/֫ۜܺ;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 285
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x1c

    if-lt v0, v13, :cond_3

    iget-boolean v0, v5, Ll/۫֫֫;->ᩴ:Z

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    .line 286
    iget-wide v13, v5, Ll/۫֫֫;->ۙ:J

    const-wide/16 v15, 0x8

    mul-long v13, v13, v15

    const-wide/32 v15, 0x10000

    add-long/2addr v13, v15

    iget v15, v5, Ll/۫֫֫;->᩷:I

    move-object/from16 v16, v5

    int-to-long v4, v15

    const-wide/16 v17, 0x100

    mul-long v4, v4, v17

    add-long/2addr v4, v13

    goto :goto_1

    :cond_4
    move-object/from16 v16, v5

    const-wide/16 v4, 0x0

    :goto_1
    if-eqz v0, :cond_5

    .line 287
    invoke-static {v1, v4, v5}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v4
    :try_end_0
    .catch Ll/ܰۜܺ; {:try_start_0 .. :try_end_0} :catch_8
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 288
    :goto_2
    :try_start_1
    invoke-virtual/range {p3 .. p3}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v13

    invoke-virtual/range {p3 .. p3}, Ll/ۖۚ֫;->᩷()J

    move-result-wide v17

    sub-long v13, v13, v17

    .line 292
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    const-wide/16 v17, 0x2

    div-long v13, v13, v17

    :goto_3
    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    const/4 v5, 0x1

    :goto_4
    const v15, 0x8000

    if-gt v5, v15, :cond_e

    .line 596
    invoke-static {v11, v5}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v17

    const-wide/16 v19, 0x800

    cmp-long v15, v17, v19

    if-gtz v15, :cond_d

    .line 597
    invoke-static {v12, v5}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v17

    cmp-long v15, v17, v19

    if-gtz v15, :cond_d

    .line 604
    invoke-static {v11, v12, v5}, Ll/۬֫֫;->ۙ(III)J

    move-result-wide v17

    int-to-long v2, v8

    mul-long v17, v17, v2

    cmp-long v2, v17, v13

    if-gtz v2, :cond_d

    .line 293
    invoke-static {v11, v5}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v2

    long-to-int v3, v2

    .line 294
    invoke-static {v12, v5}, Ll/۬֫֫;->ۙ(II)J

    move-result-wide v13
    :try_end_1
    .catch Ll/ܰۜܺ; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    long-to-int v2, v13

    int-to-long v13, v3

    move-object/from16 v21, v7

    int-to-long v7, v2

    mul-long v7, v7, v13

    const-wide/16 v13, 0x4

    mul-long v7, v7, v13

    int-to-long v13, v9

    mul-long v13, v13, v7

    .line 296
    :try_start_2
    invoke-static {v1, v13, v14}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v5
    :try_end_2
    .catch Ll/ܰۜܺ; {:try_start_2 .. :try_end_2} :catch_6
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 297
    :try_start_3
    invoke-static {v1, v7, v8}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v7
    :try_end_3
    .catch Ll/ܰۜܺ; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 298
    :try_start_4
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    move-wide/from16 v8, p4

    move-object/from16 v15, p6

    .line 299
    invoke-static {v6, v1, v8, v9, v15}, Ll/ۛ᩻֫;->ۙ(Ljava/util/LinkedHashSet;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ۛ᩻֫;

    move-result-object v1
    :try_end_4
    .catch Ll/ܰۜܺ; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 300
    :try_start_5
    invoke-virtual {v10, v1}, Ll/֫ۜܺ;->ۙ(Ll/᩶ۖܺ;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :catchall_1
    move-exception v0

    goto/16 :goto_7

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :cond_7
    move-object/from16 v15, p6

    const/4 v1, 0x0

    .line 302
    :goto_5
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v2, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6
    :try_end_5
    .catch Ll/ܰۜܺ; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 303
    :try_start_6
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    int-to-float v3, v3

    int-to-float v9, v11

    div-float/2addr v3, v9

    int-to-float v2, v2

    int-to-float v13, v12

    div-float/2addr v2, v13

    .line 304
    invoke-virtual {v8, v3, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 305
    new-instance v2, Landroid/graphics/RectF;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v3, v9, v13}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-virtual {v10, v8, v2}, Ll/֫ۜܺ;->ۙ(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V

    .line 306
    invoke-static/range {p6 .. p6}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 307
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v7, v2, v3}, Ll/ۡۚ֫;->᩷(J)Z

    move-result v2

    if-eqz v2, :cond_c

    if-eqz v0, :cond_8

    .line 310
    invoke-virtual {v10, v11, v12}, Ll/֫ۜܺ;->ۙ(II)Landroid/graphics/Picture;

    move-result-object v2
    :try_end_6
    .catch Ll/ܰۜܺ; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 311
    :try_start_7
    invoke-static/range {p6 .. p6}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 312
    new-instance v0, Ll/᩵᩻֫;

    move-object/from16 v3, v16

    iget v3, v3, Ll/۫֫֫;->᩸:I

    const/16 v20, 0x0

    const/4 v14, 0x0

    move-object v13, v0

    move-object v15, v2

    move/from16 v16, v11

    move/from16 v17, v12

    move/from16 v18, v3

    move-object/from16 v19, v4

    invoke-direct/range {v13 .. v20}, Ll/᩵᩻֫;-><init>(Ll/֫ۜܺ;Landroid/graphics/Picture;IIILl/ۡۚ֫;Ll/ۛ᩻֫;)V
    :try_end_7
    .catch Ll/ܰۜܺ; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    const/4 v2, 0x0

    move-object v3, v1

    move-object v4, v2

    move/from16 v17, v11

    move v2, v12

    goto :goto_6

    :catchall_2
    move-exception v0

    goto/16 :goto_a

    :catch_2
    move-exception v0

    const/4 v3, 0x0

    goto/16 :goto_13

    :catchall_3
    move-exception v0

    goto/16 :goto_9

    :catch_3
    move-exception v0

    goto/16 :goto_d

    :cond_8
    move-object/from16 v3, v16

    .line 316
    :try_start_8
    new-instance v0, Ll/᩵᩻֫;

    iget v14, v3, Ll/۫֫֫;->᩸:I

    const/4 v2, 0x0

    move-object v9, v0

    move/from16 v17, v11

    move-object v11, v2

    move v2, v12

    move/from16 v12, v17

    move v13, v2

    move-object/from16 v15, v21

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v16}, Ll/᩵᩻֫;-><init>(Ll/֫ۜܺ;Landroid/graphics/Picture;IIILl/ۡۚ֫;Ll/ۛ᩻֫;)V
    :try_end_8
    .catch Ll/ܰۜܺ; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object/from16 v21, v3

    move-object v3, v1

    :goto_6
    move-object v1, v0

    .line 320
    :try_start_9
    new-instance v0, Ll/ܳ֫֫;

    const-string v18, "image/svg+xml"

    .line 585
    new-instance v8, Ll/ۡ֫֫;

    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v14

    const/4 v9, 0x1

    move-object v13, v8

    move/from16 v15, v17

    move/from16 v16, v2

    move/from16 v17, v9

    move-object/from16 v19, p1

    invoke-direct/range {v13 .. v19}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;)V

    .line 320
    invoke-direct {v0, v8, v6, v7, v1}, Ll/ܳ֫֫;-><init>(Ll/ۡ֫֫;Landroid/graphics/Bitmap;Ll/ۡۚ֫;Ll/᩵᩻֫;)V
    :try_end_9
    .catch Ll/ܰۜܺ; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 331
    invoke-virtual {v5}, Ll/ۡۚ֫;->close()V

    if-eqz v3, :cond_9

    .line 333
    invoke-virtual {v3}, Ll/ۛ᩻֫;->close()V

    :cond_9
    if-eqz v4, :cond_a

    .line 335
    invoke-virtual {v4}, Ll/ۡۚ֫;->close()V

    :cond_a
    if-eqz v21, :cond_b

    .line 336
    invoke-virtual/range {v21 .. v21}, Ll/ۡۚ֫;->close()V

    :cond_b
    return-object v0

    :catchall_4
    move-exception v0

    const/4 v2, 0x0

    goto/16 :goto_15

    :catch_4
    move-exception v0

    const/4 v2, 0x0

    move-object/from16 v22, v3

    move-object v3, v1

    move-object/from16 v1, v22

    goto/16 :goto_13

    .line 308
    :cond_c
    :try_start_a
    new-instance v0, Ll/ᩳ֫֫;

    const-string v2, "SVG raster allocation exceeds budget"

    .line 459
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 308
    throw v0
    :try_end_a
    .catch Ll/ܰۜܺ; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :goto_7
    const/4 v1, 0x0

    :goto_8
    const/4 v6, 0x0

    :goto_9
    const/4 v2, 0x0

    :goto_a
    const/4 v3, 0x0

    goto/16 :goto_14

    :goto_b
    const/4 v1, 0x0

    :goto_c
    const/4 v6, 0x0

    :goto_d
    const/4 v2, 0x0

    move-object v3, v2

    goto :goto_e

    :catchall_5
    move-exception v0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v1, 0x0

    const/4 v7, 0x0

    goto/16 :goto_15

    :catch_5
    move-exception v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v6, v2

    :goto_e
    const/4 v2, 0x0

    goto/16 :goto_13

    :cond_d
    move-object/from16 v15, p6

    move-object/from16 v21, v7

    move/from16 v17, v11

    move v2, v12

    move-object/from16 v3, v16

    mul-int/lit8 v5, v5, 0x2

    move v12, v2

    move-object/from16 v16, v3

    move/from16 v11, v17

    move-object/from16 v7, v21

    move-wide/from16 v2, p4

    goto/16 :goto_4

    :cond_e
    move-object/from16 v21, v7

    .line 600
    :try_start_b
    new-instance v0, Ll/ᩳ֫֫;

    const-string v1, "Animation frames do not fit allocation limit"

    .line 459
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 600
    throw v0
    :try_end_b
    .catch Ll/ܰۜܺ; {:try_start_b .. :try_end_b} :catch_6
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    :catchall_6
    move-exception v0

    goto :goto_f

    :catch_6
    move-exception v0

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object/from16 v21, v7

    :goto_f
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, v6

    move-object v6, v2

    move-object v2, v3

    move-object v3, v1

    move-object v1, v5

    goto :goto_11

    :catch_7
    move-exception v0

    move-object/from16 v21, v7

    :goto_10
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, v5

    move-object/from16 v22, v6

    move-object v6, v2

    move-object/from16 v2, v22

    goto :goto_12

    :catchall_8
    move-exception v0

    move-object/from16 v21, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, v5

    move-object/from16 v22, v3

    move-object v3, v1

    move-object v1, v4

    move-object v4, v6

    move-object v6, v2

    move-object/from16 v2, v22

    :goto_11
    const/4 v5, 0x0

    goto :goto_15

    :catch_8
    move-exception v0

    move-object/from16 v21, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, v4

    move-object v4, v6

    move-object v6, v2

    move-object v2, v5

    :goto_12
    const/4 v5, 0x0

    .line 327
    :goto_13
    :try_start_c
    new-instance v8, Ljava/io/IOException;

    const-string v9, "SVG could not be parsed"

    invoke-direct {v8, v9, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v8
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    :catchall_9
    move-exception v0

    :goto_14
    move-object/from16 v22, v3

    move-object v3, v1

    move-object/from16 v1, v22

    :goto_15
    if-eqz v6, :cond_f

    .line 329
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V

    :cond_f
    if-eqz v7, :cond_10

    .line 330
    invoke-virtual {v7}, Ll/ۡۚ֫;->close()V

    :cond_10
    if-eqz v5, :cond_11

    .line 331
    invoke-virtual {v5}, Ll/ۡۚ֫;->close()V

    :cond_11
    if-eqz v1, :cond_12

    const/4 v5, 0x0

    .line 110
    invoke-virtual {v1, v5}, Ll/᩵᩻֫;->ۙ(Ll/ۡۚ֫;)V

    :cond_12
    if-eqz v3, :cond_13

    .line 333
    invoke-virtual {v3}, Ll/ۛ᩻֫;->close()V

    :cond_13
    if-eqz v2, :cond_14

    const/4 v1, 0x1

    .line 334
    invoke-virtual {v2, v1, v1}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Picture;->endRecording()V

    :cond_14
    if-eqz v4, :cond_15

    .line 335
    invoke-virtual {v4}, Ll/ۡۚ֫;->close()V

    :cond_15
    if-eqz v21, :cond_16

    .line 336
    invoke-virtual/range {v21 .. v21}, Ll/ۡۚ֫;->close()V

    .line 337
    :cond_16
    throw v0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/ᩴ֫֫;Ll/ۖۚ֫;JJLl/ۘۧ֫;)Ll/ܳ֫֫;
    .locals 21

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    move-wide/from16 v1, p3

    .line 103
    invoke-static/range {p7 .. p7}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1d

    cmp-long v5, p5, v3

    if-lez v5, :cond_1d

    .line 105
    iget-object v7, v0, Ll/ᩴ֫֫;->᩷:Ll/ܳۧ֫;

    .line 106
    invoke-virtual {v8, v7}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    iget-wide v5, v7, Ll/ܳۧ֫;->ۤ:J

    .line 107
    iget-object v0, v0, Ll/ᩴ֫֫;->ۙ:Ll/۟۠ۚ;

    iget-object v0, v0, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    .line 108
    sget-object v9, Ll/֡۠ۚ;->ܿ:Ll/֡۠ۚ;

    const/4 v15, 0x0

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/֡۠ۚ;->ᩳ:Ll/֡۠ۚ;

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/֡۠ۚ;->ۢ:Ll/֡۠ۚ;

    if-eq v0, v9, :cond_1c

    sget-object v9, Ll/֡۠ۚ;->᩶:Ll/֡۠ۚ;

    const/16 v10, 0x1c

    if-ne v0, v9, :cond_0

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v11, v10, :cond_0

    goto/16 :goto_11

    .line 110
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v11

    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    .line 111
    sget-object v1, Ll/֡۠ۚ;->֡:Ll/֡۠ۚ;

    if-ne v0, v1, :cond_9

    .line 59
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->ۚ()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v10, v8

    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v1

    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "file:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 110
    new-instance v3, Ll/᩷ۧ֫;

    invoke-direct {v3, v1, v2}, Ll/᩷ۧ֫;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v10, v3

    :goto_0
    if-nez v0, :cond_2

    move-object v11, v7

    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v10}, Ll/۫ۧ֫;->ۗ()Ll/ܳۧ֫;

    move-result-object v0

    move-object v11, v0

    .line 62
    :goto_1
    new-instance v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    new-instance v0, Ll/ۛ֫֫;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    .line 64
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->setRemoveOnCancelPolicy(Z)V

    .line 66
    new-instance v3, Ljava/util/concurrent/FutureTask;

    new-instance v0, Ll/᩺֫֫;

    move-object v9, v0

    move-object/from16 v12, p2

    move-wide/from16 v13, p5

    move-object v4, v15

    move-object/from16 v15, p7

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v16}, Ll/᩺֫֫;-><init>(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/ۖۚ֫;JLl/ۘۧ֫;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V

    invoke-direct {v3, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 67
    invoke-virtual {v1, v3}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    const/4 v5, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 73
    :goto_2
    :try_start_0
    invoke-virtual {v3}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ll/۟֫֫;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_c
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_8
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    :try_start_1
    invoke-virtual {v8, v7}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 77
    invoke-static/range {p7 .. p7}, Ll/۫ۧ֫;->ۙ(Ll/۟֡֫;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v6, :cond_3

    .line 98
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 113
    :cond_3
    new-instance v0, Ll/ܳ֫֫;

    iget v1, v9, Ll/۟֫֫;->ۤۙ:I

    iget v2, v9, Ll/۟֫֫;->֨:I

    .line 585
    new-instance v3, Ll/ۡ֫֫;

    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v4

    const-string v5, "image/gif"

    const/4 v6, 0x1

    move-object/from16 p0, v3

    move-object/from16 p1, v4

    move/from16 p2, v1

    move/from16 p3, v2

    move/from16 p4, v6

    move-object/from16 p5, v5

    move-object/from16 p6, v7

    invoke-direct/range {p0 .. p6}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;)V

    .line 113
    invoke-direct {v0, v3, v9}, Ll/ܳ֫֫;-><init>(Ll/ۡ֫֫;Ll/۟ۚ֫;)V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    .line 236
    :goto_3
    :try_start_2
    invoke-virtual {v9, v4}, Ll/۟֫֫;->ۙ(Ll/ۡۚ֫;)V

    .line 81
    throw v0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_a
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    const/4 v0, 0x1

    const/4 v5, 0x1

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_7

    :catch_5
    move-exception v0

    goto :goto_6

    :catch_6
    move-exception v0

    goto :goto_6

    :catch_7
    move-exception v0

    goto :goto_6

    :catch_8
    move-exception v0

    move v2, v5

    .line 86
    :goto_4
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    .line 87
    instance-of v3, v0, Ljava/io/IOException;

    if-nez v3, :cond_6

    .line 88
    instance-of v3, v0, Ljava/lang/RuntimeException;

    if-nez v3, :cond_5

    .line 89
    instance-of v3, v0, Ljava/lang/Error;

    if-eqz v3, :cond_4

    check-cast v0, Ljava/lang/Error;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 90
    :cond_4
    new-instance v3, Ljava/io/IOException;

    const-string v4, "GIF worker failed"

    invoke-direct {v3, v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    .line 88
    :cond_5
    check-cast v0, Ljava/lang/RuntimeException;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0

    .line 87
    :cond_6
    check-cast v0, Ljava/io/IOException;

    invoke-static {v0}, Ll/᩷᩷ܺ;->ۙ(Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_9
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_9
    move-exception v0

    goto :goto_5

    :catch_a
    move-exception v0

    goto :goto_5

    :catch_b
    move-exception v0

    :goto_5
    move v5, v2

    :goto_6
    if-nez v5, :cond_7

    .line 94
    :try_start_4
    invoke-virtual {v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->shutdown()V

    .line 95
    :cond_7
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    if-eqz v6, :cond_8

    .line 98
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 99
    :cond_8
    throw v0

    :catch_c
    :goto_8
    const/4 v6, 0x1

    goto/16 :goto_2

    :cond_9
    if-ne v0, v9, :cond_a

    .line 115
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v10, :cond_a

    move-object/from16 v1, p0

    move-object v2, v7

    move-object/from16 v3, p2

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    .line 116
    invoke-static/range {v1 .. v6}, Ll/ܽܺ֫;->ۙ(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ܽܺ֫;

    move-result-object v0

    .line 118
    new-instance v1, Ll/ܳ֫֫;

    new-instance v2, Ll/ۡ֫֫;

    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->۫()Ljava/lang/String;

    move-result-object v3

    iget v4, v0, Ll/ܽܺ֫;->ۗۙ:I

    iget v5, v0, Ll/ܽܺ֫;->ۙۙ:I

    iget v6, v0, Ll/ܽܺ֫;->֫ۙ:I

    const-string v8, "image/webp"

    move-object/from16 p0, v2

    move-object/from16 p1, v3

    move/from16 p2, v4

    move/from16 p3, v5

    move/from16 p4, v6

    move-object/from16 p5, v8

    move-object/from16 p6, v7

    invoke-direct/range {p0 .. p6}, Ll/ۡ֫֫;-><init>(Ljava/lang/String;IIILjava/lang/String;Ll/ܳۧ֫;)V

    invoke-direct {v1, v2, v0}, Ll/ܳ֫֫;-><init>(Ll/ۡ֫֫;Ll/۟ۚ֫;)V

    return-object v1

    .line 141
    :cond_a
    invoke-virtual/range {p2 .. p2}, Ll/ۖۚ֫;->ۙ()J

    move-result-wide v0

    const-wide/16 v9, 0x2

    .line 142
    div-long v13, v0, v9

    const-wide/32 v9, 0x800000

    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    cmp-long v2, v5, v3

    if-ltz v2, :cond_b

    goto :goto_9

    :cond_b
    const-wide/32 v5, 0x8000

    .line 143
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :goto_9
    cmp-long v15, v5, v3

    if-lez v15, :cond_1b

    const-string v3, "Special image input exceeds byte limit"

    cmp-long v4, v5, v9

    if-gtz v4, :cond_1a

    cmp-long v4, v5, v0

    if-gez v4, :cond_19

    move-object/from16 v4, p2

    .line 148
    invoke-static {v4, v5, v6}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v9

    long-to-int v6, v5

    .line 150
    :try_start_5
    new-array v5, v6, [B

    .line 152
    invoke-virtual {v8, v7}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 153
    invoke-virtual/range {p0 .. p0}, Ll/۫ۧ֫;->᩹()Ljava/io/InputStream;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_8

    const/4 v10, 0x0

    move-object v15, v4

    .line 155
    :goto_a
    :try_start_6
    invoke-static/range {p7 .. p7}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 156
    array-length v4, v5

    if-ne v10, v4, :cond_11

    .line 157
    invoke-virtual {v6}, Ljava/io/InputStream;->read()I

    move-result v4

    if-gez v4, :cond_c

    move-wide/from16 v16, v11

    move-object v11, v7

    goto/16 :goto_b

    :cond_c
    if-gez v2, :cond_10

    move/from16 p1, v2

    .line 160
    array-length v2, v5

    move-wide/from16 v16, v11

    const/high16 v11, 0x800000

    if-ge v2, v11, :cond_f

    .line 161
    array-length v2, v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    int-to-long v11, v2

    const-string v2, "Input growth exceeds allocation limit"

    cmp-long v18, v11, v13

    if-gez v18, :cond_e

    .line 163
    :try_start_7
    array-length v11, v5

    int-to-long v11, v11

    const-wide/16 v18, 0x2

    mul-long v11, v11, v18

    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    long-to-int v12, v11

    .line 164
    array-length v11, v5

    move-wide/from16 p3, v13

    int-to-long v13, v11

    move-object v11, v7

    int-to-long v7, v12

    add-long/2addr v13, v7

    cmp-long v20, v13, v0

    if-gtz v20, :cond_d

    .line 166
    invoke-static {v15, v7, v8}, Ll/ܺ֫֫;->ۙ(Ll/ۖۚ֫;J)Ll/ۡۚ֫;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 168
    :try_start_8
    new-array v7, v12, [B

    const/4 v8, 0x0

    .line 169
    invoke-static {v5, v8, v7, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v5, v10, 0x1

    int-to-byte v4, v4

    .line 170
    aput-byte v4, v7, v10

    .line 172
    invoke-virtual {v9}, Ll/ۡۚ֫;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v8, p0

    move-object v9, v2

    move v10, v5

    move-object v5, v7

    move-object v12, v11

    goto/16 :goto_f

    :catchall_1
    move-exception v0

    .line 176
    :try_start_9
    invoke-virtual {v2}, Ll/ۡۚ֫;->close()V

    .line 177
    throw v0

    .line 165
    :cond_d
    new-instance v0, Ll/ᩳ֫֫;

    .line 459
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 165
    throw v0

    .line 162
    :cond_e
    new-instance v0, Ll/ᩳ֫֫;

    .line 459
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    throw v0

    .line 160
    :cond_f
    new-instance v0, Ll/᩸֫֫;

    .line 488
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 160
    throw v0

    .line 159
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Special image input size changed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    move/from16 p1, v2

    move-wide/from16 v16, v11

    move-wide/from16 p3, v13

    const-wide/16 v18, 0x2

    move-object v11, v7

    .line 179
    array-length v2, v5

    sub-int/2addr v2, v10

    invoke-virtual {v6, v5, v10, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-gez v2, :cond_12

    goto :goto_b

    :cond_12
    if-nez v2, :cond_16

    .line 182
    invoke-virtual {v6}, Ljava/io/InputStream;->read()I

    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    if-gez v2, :cond_15

    :goto_b
    if-eqz v6, :cond_13

    .line 188
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    :cond_13
    move-object/from16 v8, p0

    move-object v7, v11

    .line 189
    invoke-virtual {v8, v7}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 190
    new-instance v11, Ll/᩷֫֫;

    invoke-direct {v11, v5, v10, v9}, Ll/᩷֫֫;-><init>([BILl/ۡۚ֫;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 125
    :try_start_b
    invoke-static/range {p7 .. p7}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    move-object/from16 v1, p0

    move-object v2, v7

    move-object v3, v11

    move-object/from16 v4, p2

    move-wide/from16 v5, v16

    move-object v12, v7

    move-object/from16 v7, p7

    .line 126
    invoke-static/range {v1 .. v7}, Ll/ܺ֫֫;->ۙ(Ll/۫ۧ֫;Ll/ܳۧ֫;Ll/᩷֫֫;Ll/ۖۚ֫;JLl/ۘۧ֫;)Ll/ܳ֫֫;

    move-result-object v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 127
    :try_start_c
    invoke-virtual {v8, v12}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 128
    invoke-static/range {p7 .. p7}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 135
    invoke-virtual {v11}, Ll/᩷֫֫;->close()V

    return-object v1

    :catchall_2
    move-exception v0

    goto :goto_c

    :catchall_3
    move-exception v0

    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_14

    const/4 v2, 0x0

    .line 711
    :try_start_d
    invoke-virtual {v1, v2}, Ll/ܳ֫֫;->ۙ(Ll/ۡۚ֫;)V

    .line 134
    :cond_14
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception v0

    move-object v1, v0

    .line 122
    :try_start_e
    invoke-virtual {v11}, Ll/᩷֫֫;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    :cond_15
    move-object/from16 v8, p0

    move-object v12, v11

    add-int/lit8 v4, v10, 0x1

    int-to-byte v2, v2

    .line 184
    :try_start_f
    aput-byte v2, v5, v10
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    goto :goto_e

    :cond_16
    move-object/from16 v8, p0

    move-object v12, v11

    add-int v4, v10, v2

    :goto_e
    move-object/from16 v15, p2

    move v10, v4

    :goto_f
    move/from16 v2, p1

    move-object/from16 v4, p2

    move-wide/from16 v13, p3

    move-object v7, v12

    move-wide/from16 v11, v16

    goto/16 :goto_a

    :catchall_6
    move-exception v0

    move-object v1, v0

    if-eqz v6, :cond_17

    .line 153
    :try_start_10
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_10

    :catchall_7
    move-exception v0

    move-object v2, v0

    :try_start_11
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_17
    :goto_10
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    :catchall_8
    move-exception v0

    if-eqz v9, :cond_18

    .line 194
    invoke-virtual {v9}, Ll/ۡۚ֫;->close()V

    .line 195
    :cond_18
    throw v0

    .line 147
    :cond_19
    new-instance v0, Ll/ᩳ֫֫;

    const-string v1, "Special image input exceeds allocation limit"

    .line 459
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 147
    throw v0

    .line 145
    :cond_1a
    new-instance v0, Ll/᩸֫֫;

    .line 488
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 145
    throw v0

    .line 144
    :cond_1b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Special image input is empty"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    :goto_11
    move-object v13, v15

    return-object v13

    .line 104
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Format allocation limit must be positive"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ۙ(Ll/۫ۧ֫;Ll/᩺ۧ֫;)Ll/ᩴ֫֫;
    .locals 10

    .line 64
    sget-object v0, Ll/ۜ֫֫;->ۤ:Ll/ۜ֫֫;

    .line 68
    invoke-static {p1}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 69
    invoke-virtual {p0}, Ll/۫ۧ֫;->ۗ()Ll/ܳۧ֫;

    move-result-object v1

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    sget-object v2, Ll/ۜ֫֫;->᩸:Ll/ۜ֫֫;

    .line 71
    iget-wide v3, v1, Ll/ܳۧ֫;->ۤ:J

    invoke-static {v3, v4, v2}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 73
    invoke-static {p0, v2}, Ll/۬֫֫;->ۙ(Ll/۫ۧ֫;Ll/ۜ֫֫;)Ll/֨֫֫;

    move-result-object v2

    .line 74
    :try_start_0
    invoke-static {v2}, Ll/ᩳ۠ۚ;->ۙ(Ljava/io/InputStream;)Ll/۟۠ۚ;

    move-result-object v5

    iget-object v6, v5, Ll/۟۠ۚ;->ۤ:Ljava/lang/String;

    iget-object v7, v5, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    .line 75
    invoke-virtual {v2}, Ll/֨֫֫;->ۙ()V

    .line 76
    sget-object v8, Ll/֡۠ۚ;->ᩳ:Ll/֡۠ۚ;

    if-eq v7, v8, :cond_0

    const-string v9, "image/jpeg"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    .line 77
    iget-boolean v9, v5, Ll/۟۠ۚ;->᩸:Z

    invoke-virtual {v0, v6, v9}, Ll/ۜ֫֫;->ۙ(Ljava/lang/String;Z)Ll/ۜ֫֫;

    move-result-object v6

    .line 78
    invoke-static {v3, v4, v6}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 79
    invoke-virtual {v2, v6}, Ll/֨֫֫;->ۙ(Ll/ۜ֫֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :cond_0
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 84
    sget-object v2, Ll/֡۠ۚ;->ۢ:Ll/֡۠ۚ;

    if-eq v7, v2, :cond_1

    if-ne v7, v8, :cond_2

    .line 86
    :cond_1
    :try_start_1
    invoke-static {v3, v4, v0}, Ll/۬֫֫;->ۙ(JLl/ۜ֫֫;)V

    .line 87
    new-instance v2, Ll/ۙ֫֫;

    invoke-direct {v2, p1, p0, v0}, Ll/ۙ֫֫;-><init>(Ll/᩺ۧ֫;Ll/۫ۧ֫;Ll/ۜ֫֫;)V

    invoke-static {v5, v2}, Ll/ᩳ۠ۚ;->ۙ(Ll/۟۠ۚ;Ll/ܿ۠ۚ;)Ll/۟۠ۚ;

    move-result-object v5
    :try_end_1
    .catch Ll/ۢ֫֫; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 92
    iget-object v2, v5, Ll/۟۠ۚ;->᩷:Ll/֡۠ۚ;

    sget-object v3, Ll/֡۠ۚ;->ᩳ:Ll/֡۠ۚ;

    if-ne v2, v3, :cond_3

    .line 95
    :cond_2
    :goto_0
    invoke-virtual {p0, v1}, Ll/۫ۧ֫;->ۙ(Ll/ܳۧ֫;)V

    .line 96
    invoke-static {p1}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    .line 97
    new-instance p0, Ll/ᩴ֫֫;

    invoke-direct {p0, v1, v5}, Ll/ᩴ֫֫;-><init>(Ll/ܳۧ֫;Ll/۟۠ۚ;)V

    return-object p0

    .line 92
    :cond_3
    throw v0

    :catchall_0
    move-exception p0

    .line 73
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
.end method

.method public static ۙ(II[B)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    add-int v1, p0, v0

    mul-int/lit8 v2, v0, 0x8

    ushr-int v2, p1, v2

    int-to-byte v2, v2

    .line 251
    aput-byte v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ۙ(Ll/ۚ֫֫;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۘۧ֫;)V
    .locals 14

    move-object v0, p0

    move-object/from16 v9, p2

    move/from16 v10, p4

    .line 521
    invoke-static/range {p7 .. p7}, Ll/ܺ֫֫;->ۙ(Ll/۟֡֫;)V

    const/4 v1, 0x0

    .line 522
    aget-wide v2, p3, v1

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const-wide/32 v4, 0x8000

    cmp-long v1, v2, v4

    if-gtz v1, :cond_7

    const/16 v1, 0x40

    if-gt v10, v1, :cond_7

    invoke-virtual {v9, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x1

    .line 524
    aget-wide v2, p3, v1

    int-to-long v4, v10

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    aput-wide v2, p3, v1

    const/4 v1, 0x2

    .line 525
    aget-wide v2, p3, v1

    iget-wide v4, v0, Ll/ۚ֫֫;->ۙ:J

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const/4 v1, 0x4

    .line 526
    aget-wide v2, p3, v1

    iget-wide v4, v0, Ll/ۚ֫֫;->᩸:J

    add-long/2addr v2, v4

    aput-wide v2, p3, v1

    const-wide/32 v4, 0x100000

    cmp-long v1, v2, v4

    if-gtz v1, :cond_6

    const/4 v1, 0x3

    if-eqz p6, :cond_0

    if-lez v10, :cond_0

    const/4 v2, 0x3

    goto :goto_0

    .line 528
    :cond_0
    iget v2, v0, Ll/ۚ֫֫;->ᩴ:I

    :goto_0
    add-int v11, p5, v2

    .line 529
    aget-wide v2, p3, v1

    int-to-long v4, v11

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    aput-wide v2, p3, v1

    .line 531
    iget-object v1, v0, Ll/ۚ֫֫;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_1
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֫֫;

    .line 532
    iget-boolean v2, v1, Ll/ۚ֫֫;->ۤ:Z

    if-eqz v2, :cond_2

    if-eqz p6, :cond_1

    :cond_2
    add-int/lit8 v5, v10, 0x1

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v11

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, Ll/ܺ֫֫;->ۙ(Ll/ۚ֫֫;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۘۧ֫;)V

    goto :goto_1

    .line 534
    :cond_3
    iget-object v1, v0, Ll/ۚ֫֫;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_4
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v13, p1

    .line 535
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ֫֫;

    if-eqz v1, :cond_4

    add-int/lit8 v5, v10, 0x1

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v11

    move/from16 v7, p6

    move-object/from16 v8, p7

    .line 536
    invoke-static/range {v1 .. v8}, Ll/ܺ֫֫;->ۙ(Ll/ۚ֫֫;Ljava/util/HashMap;Ljava/util/HashSet;[JIIZLl/ۘۧ֫;)V

    goto :goto_2

    .line 538
    :cond_5
    invoke-virtual {v9, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void

    .line 527
    :cond_6
    new-instance v0, Ll/᩸֫֫;

    const-string v1, "SVG expanded geometry exceeds safe render limits"

    .line 488
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 527
    throw v0

    .line 523
    :cond_7
    new-instance v0, Ll/᩸֫֫;

    const-string v1, "SVG references exceed safe render limits"

    .line 488
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 523
    throw v0
.end method

.method public static ۙ(Ll/۟֡֫;)V
    .locals 1

    .line 614
    invoke-interface {p0}, Ll/۟֡֫;->۫()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/io/InterruptedIOException;

    const-string v0, "Image decode cancelled"

    invoke-direct {p0, v0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۙ(Ljava/lang/String;I[B)Z
    .locals 4

    const/4 v0, 0x0

    if-ltz p1, :cond_3

    .line 618
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, p1

    array-length v2, p2

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 619
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    add-int v2, p1, v1

    aget-byte v2, p2, v2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_1
    return v0
.end method

.method public static ۤ(I[B)J
    .locals 4

    .line 625
    invoke-static {p0, p1}, Ll/ܺ֫֫;->᩷(I[B)I

    move-result v0

    int-to-long v0, v0

    const-wide/32 v2, 0xffffff

    and-long/2addr v0, v2

    add-int/lit8 p0, p0, 0x3

    aget-byte p0, p1, p0

    int-to-long p0, p0

    const-wide/16 v2, 0xff

    and-long/2addr p0, v2

    const/16 v2, 0x18

    shl-long/2addr p0, v2

    or-long/2addr p0, v0

    return-wide p0
.end method

.method public static ᩷(I[B)I
    .locals 1

    .line 624
    invoke-static {p0, p1}, Ll/ܺ֫֫;->ۙ(I[B)I

    move-result v0

    add-int/lit8 p0, p0, 0x2

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x10

    or-int/2addr p0, v0

    return p0
.end method

.method public static ᩷(Ljava/lang/String;I[B)V
    .locals 3

    const/4 v0, 0x0

    .line 247
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    add-int v1, p1, v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, p2, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

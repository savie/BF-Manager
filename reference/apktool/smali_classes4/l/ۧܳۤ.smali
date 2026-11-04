.class public final Ll/ۧܳۤ;
.super Ljava/lang/Object;
.source "C1G9"

# interfaces
.implements Ll/ۛܳۤ;


# virtual methods
.method public final ۙ(Ll/۫ᩴۤ;Ll/ۨܳۤ;Ll/֫ܶۤ;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const/4 v2, 0x1

    .line 17
    invoke-virtual {v0, v2}, Ll/۫ᩴۤ;->᩷(Z)V

    const-string v3, "format"

    move-object/from16 v4, p3

    .line 66
    invoke-virtual {v4, v3}, Ll/֫ܶۤ;->ۙ(Ljava/lang/String;)Ll/ۚܶۤ;

    move-result-object v3

    const-string v5, "enum"

    const/4 v6, 0x0

    if-nez v3, :cond_0

    const v3, 0xffff

    goto/16 :goto_4

    .line 69
    :cond_0
    invoke-virtual {v3}, Ll/ۚܶۤ;->᩷()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v3, 0x0

    goto/16 :goto_4

    .line 73
    :cond_1
    invoke-virtual {v3}, Ll/ۚܶۤ;->᩷()Ljava/lang/String;

    move-result-object v7

    const-string v8, "\\|"

    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const/high16 v11, 0x10000

    const/high16 v12, 0x20000

    if-ge v10, v8, :cond_c

    aget-object v13, v7, v10

    .line 74
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v14

    const/4 v15, -0x1

    sparse-switch v14, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v14, "integer"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v15, 0x9

    goto/16 :goto_1

    :sswitch_1
    const-string v14, "float"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v15, 0x8

    goto :goto_1

    :sswitch_2
    const-string v14, "flags"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    goto :goto_1

    :cond_4
    const/4 v15, 0x7

    goto :goto_1

    :sswitch_3
    const-string v14, "color"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_1

    :cond_5
    const/4 v15, 0x6

    goto :goto_1

    :sswitch_4
    const-string v14, "boolean"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_1

    :cond_6
    const/4 v15, 0x5

    goto :goto_1

    :sswitch_5
    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_1

    :cond_7
    const/4 v15, 0x4

    goto :goto_1

    :sswitch_6
    const-string v14, "string"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    goto :goto_1

    :cond_8
    const/4 v15, 0x3

    goto :goto_1

    :sswitch_7
    const-string v14, "reference"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_9

    goto :goto_1

    :cond_9
    const/4 v15, 0x2

    goto :goto_1

    :sswitch_8
    const-string v14, "dimension"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    goto :goto_1

    :cond_a
    const/4 v15, 0x1

    goto :goto_1

    :sswitch_9
    const-string v14, "fraction"

    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_b

    goto :goto_1

    :cond_b
    const/4 v15, 0x0

    :goto_1
    packed-switch v15, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    or-int/lit8 v9, v9, 0x4

    goto :goto_2

    :pswitch_1
    or-int/lit8 v9, v9, 0x20

    goto :goto_2

    :pswitch_2
    or-int/2addr v9, v12

    goto :goto_2

    :pswitch_3
    or-int/lit8 v9, v9, 0x10

    goto :goto_2

    :pswitch_4
    or-int/lit8 v9, v9, 0x8

    goto :goto_2

    :pswitch_5
    or-int/2addr v9, v11

    goto :goto_2

    :pswitch_6
    or-int/lit8 v9, v9, 0x2

    goto :goto_2

    :pswitch_7
    or-int/lit8 v9, v9, 0x1

    goto :goto_2

    :pswitch_8
    or-int/lit8 v9, v9, 0x40

    goto :goto_2

    :pswitch_9
    or-int/lit16 v9, v9, 0x80

    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_c
    and-int v7, v9, v11

    if-eqz v7, :cond_e

    and-int v7, v9, v12

    if-nez v7, :cond_d

    goto :goto_3

    .line 108
    :cond_d
    new-instance v0, Ll/ۢܽۤ;

    const-string v1, "Cannot define flag and enum at the same time"

    invoke-direct {v0, v1, v3}, Ll/ۢܽۤ;-><init>(Ljava/lang/String;Ll/ۚܶۤ;)V

    throw v0

    :cond_e
    :goto_3
    move v3, v9

    :goto_4
    const/high16 v7, 0x1000000

    const/16 v8, 0x10

    .line 19
    invoke-virtual {v0, v3, v8, v7}, Ll/۫ᩴۤ;->ۙ(III)Ll/ۗᩴۤ;

    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "idTypeNameMap-"

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/۫ᩴۤ;->ܿ()Ll/᩻ᩴۤ;

    move-result-object v7

    invoke-virtual {v7}, Ll/ܶ᩸ۤ;->۫()I

    move-result v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ll/ۡ֫᩵;

    invoke-direct {v7, v2, v0}, Ll/ۡ֫᩵;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3, v7}, Ll/ۨܳۤ;->ۙ(Ljava/lang/String;Ll/ۡ֫᩵;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۛᩴۤ;

    .line 28
    invoke-virtual/range {p1 .. p1}, Ll/۫ᩴۤ;->ܿ()Ll/᩻ᩴۤ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩻ᩴۤ;->ۘ()Ll/᩹ᩴۤ;

    move-result-object v3

    if-eqz v3, :cond_f

    .line 30
    invoke-virtual {v3}, Ll/᩹ᩴۤ;->᩻()Ll/᩻ᩴۤ;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܶ᩸ۤ;->۫()I

    move-result v6

    shl-int/lit8 v6, v6, 0x18

    invoke-virtual {v3}, Ll/ܰ᩸ۤ;->ܶۙ()I

    move-result v3

    shl-int/2addr v3, v8

    or-int/2addr v6, v3

    .line 33
    :cond_f
    new-instance v3, Ll/ۚܺܺ;

    invoke-direct {v3}, Ll/ۚܺܺ;-><init>()V

    .line 34
    invoke-static/range {p3 .. p3}, Ll/֫ܶۤ;->ۙ(Ll/֫ܶۤ;)Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫ܶۤ;

    .line 35
    invoke-virtual {v7}, Ll/֫ܶۤ;->֫()Ljava/lang/String;

    move-result-object v8

    const-string v9, "flag"

    .line 36
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_6

    .line 58
    :cond_10
    invoke-static {v7, v3}, Ll/ܶܳۤ;->ۙ(Ll/֫ܶۤ;Ll/ۚܺܺ;)I

    move-result v8

    .line 59
    invoke-static {v0, v1, v7}, Ll/ܶܳۤ;->᩷(Ll/۫ᩴۤ;Ll/ۨܳۤ;Ll/֫ܶۤ;)Ll/ۗᩴۤ;

    move-result-object v7

    invoke-virtual {v7, v8}, Ll/ۗᩴۤ;->᩸(I)V

    goto :goto_5

    :cond_11
    :goto_6
    const-string v8, "name"

    .line 37
    invoke-virtual {v7, v8}, Ll/֫ܶۤ;->᩷(Ljava/lang/String;)Ll/ۚܶۤ;

    move-result-object v8

    const-string v9, "value"

    .line 38
    invoke-virtual {v7, v9}, Ll/֫ܶۤ;->᩷(Ljava/lang/String;)Ll/ۚܶۤ;

    move-result-object v7

    .line 39
    invoke-virtual {v8}, Ll/ۚܶۤ;->᩷()Ljava/lang/String;

    move-result-object v9

    .line 40
    invoke-virtual {v7}, Ll/ۚܶۤ;->᩷()Ljava/lang/String;

    move-result-object v10

    .line 42
    invoke-static {v9}, Ll/ܶܳۤ;->ۙ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v11

    if-nez v11, :cond_13

    if-nez v2, :cond_12

    const/4 v11, 0x0

    goto :goto_7

    .line 44
    :cond_12
    invoke-virtual {v2, v9}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    :goto_7
    if-eqz v11, :cond_13

    .line 46
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    or-int/2addr v11, v6

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    :cond_13
    if-eqz v11, :cond_15

    .line 52
    invoke-static {v10, v3}, Ll/ۧܺܺ;->ۤ(Ljava/lang/String;Ll/ۚܺܺ;)Z

    move-result v8

    if-eqz v8, :cond_14

    .line 53
    iget v7, v3, Ll/ۚܺܺ;->ۤ:I

    iget v8, v3, Ll/ۚܺܺ;->ᩴ:I

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v0, v7, v8, v9}, Ll/۫ᩴۤ;->ۙ(III)Ll/ۗᩴۤ;

    goto :goto_5

    .line 55
    :cond_14
    new-instance v0, Ll/ۢܽۤ;

    const-string v1, "Value must be integer"

    invoke-direct {v0, v1, v7}, Ll/ۢܽۤ;-><init>(Ljava/lang/String;Ll/ۚܶۤ;)V

    throw v0

    .line 50
    :cond_15
    new-instance v0, Ll/ۢܽۤ;

    const-string v1, "Unknown name: "

    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v8}, Ll/ۢܽۤ;-><init>(Ljava/lang/String;Ll/ۚܶۤ;)V

    throw v0

    :cond_16
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x62923dfe -> :sswitch_9
        -0x4144929a -> :sswitch_8
        -0x3724c0b5 -> :sswitch_7
        -0x352a9fef -> :sswitch_6
        0x2f9501 -> :sswitch_5
        0x3db6c28 -> :sswitch_4
        0x5a72f63 -> :sswitch_3
        0x5cfee87 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
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

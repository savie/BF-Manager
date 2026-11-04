.class public final Ll/ܺ᩵ۚ;
.super Ll/ᩳܳۚ;
.source "H7AC"


# instance fields
.field public ۙ:Lbin/mt/json/JSONObject;

.field public final ۤ:Ll/֫ۨۚ;

.field public ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/֫ۨۚ;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ܺ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    return-void
.end method

.method public static ۙ(J)Lbin/mt/json/JSONValue;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gez v2, :cond_0

    .line 374
    sget-object p0, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    return-object p0

    .line 376
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(Ll/ۤۛۚ;Ll/ۘ۫ۚ;Ljava/lang/String;)Ll/֨ܳۚ;
    .locals 5

    .line 200
    iget-object v0, p1, Ll/ۤۛۚ;->ۗ:Ljava/lang/String;

    iget-object v1, p0, Ll/ܺ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-virtual {v1}, Ll/֫ۨۚ;->᩷()Ll/ᩳۚۚ;

    move-result-object v2

    .line 201
    :try_start_0
    iget-object v3, p1, Ll/ۤۛۚ;->ۤ:Ljava/lang/String;

    new-instance v4, Ll/ۚ۟ܳ;

    invoke-direct {v4, p0, p1, p2}, Ll/ۚ۟ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v3, p3, v4}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨۚ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܳۚ;

    .line 209
    invoke-virtual {v1, v0}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 211
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 200
    :try_start_1
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public static ۙ(Ll/ܺ᩵ۚ;Ll/ۤۛۚ;Ll/ۘ۫ۚ;I)Ll/֨ܳۚ;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    .line 204
    iget-object v1, v1, Ll/ܺ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    move-object/from16 v2, p2

    invoke-virtual {v1, v0, v2}, Ll/֫ۨۚ;->ۙ(Ll/ۤۛۚ;Ll/ۘ۫ۚ;)Ll/ᩴ᩺ۚ;

    move-result-object v1

    .line 205
    sget v2, Ll/᩺۫ۚ;->ۙ:I

    .line 206
    new-instance v2, Ll/֨ܳۚ;

    .line 220
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v1, Ll/ᩴ᩺ۚ;->ܳ:Ljava/lang/String;

    iget-object v5, v1, Ll/ᩴ᩺ۚ;->᩸:Ljava/util/ArrayList;

    iget-object v6, v1, Ll/ᩴ᩺ۚ;->ۙ:Ll/ܰ᩹ۚ;

    const-string v7, "workspaceId"

    .line 221
    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v0, Ll/ۤۛۚ;->ۤ:Ljava/lang/String;

    iget v7, v0, Ll/ۤۛۚ;->ۚ:I

    iget-object v8, v0, Ll/ۤۛۚ;->᩸:Ljava/lang/String;

    iget-object v9, v0, Ll/ۤۛۚ;->ܶ:Ljava/lang/String;

    const-string v10, "editSessionId"

    .line 222
    invoke-virtual {v3, v10, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v10, "searchTarget"

    iget-object v11, v1, Ll/ᩴ᩺ۚ;->ۤ:Ljava/lang/String;

    .line 223
    invoke-virtual {v3, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v10, v1, Ll/ᩴ᩺ۚ;->᩷:Ljava/util/ArrayList;

    iget-boolean v11, v0, Ll/ۤۛۚ;->ܳ:Z

    .line 254
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v12

    .line 255
    new-instance v13, Ll/ۧ᩵ۚ;

    invoke-direct {v13}, Ll/ۧ᩵ۚ;-><init>()V

    .line 256
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    move-object/from16 p0, v2

    const-string v2, "searchScope"

    if-eqz v15, :cond_25

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/᩸᩺ۚ;

    move-object/from16 p2, v14

    .line 258
    iget-object v14, v15, Ll/᩸᩺ۚ;->ܽ:Ljava/lang/String;

    move-object/from16 v16, v4

    iget-object v4, v15, Ll/᩸᩺ۚ;->ܺ:Ll/۫ܶۚ;

    move/from16 v17, v7

    const-string v7, "native_symbol"

    .line 42
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    const-string v0, "native_string"

    if-nez v18, :cond_0

    .line 43
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 259
    :cond_0
    invoke-static {v15}, Ll/ᩳܺۚ;->ۙ(Ll/᩸᩺ۚ;)Z

    move-result v18

    if-eqz v18, :cond_24

    :cond_1
    move-object/from16 v18, v10

    .line 263
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v10

    if-nez v4, :cond_2

    const/16 v19, 0x0

    move-object/from16 v25, v19

    move-object/from16 v19, v6

    goto :goto_1

    :cond_2
    move-object/from16 v19, v6

    .line 2338
    iget v6, v4, Ll/۫ܶۚ;->ᩴ:I

    .line 788
    invoke-static {v6}, Ll/۟ܶۚ;->ۙ(I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v25, v6

    .line 446
    :goto_1
    iget-object v6, v15, Ll/᩸᩺ۚ;->ܳ:Ljava/lang/String;

    move-object/from16 v26, v5

    iget-object v5, v15, Ll/᩸᩺ۚ;->᩸:Ljava/lang/String;

    move-object/from16 v27, v8

    iget-object v8, v15, Ll/᩸᩺ۚ;->ۙ:Ljava/lang/String;

    move-object/from16 v28, v9

    iget-object v9, v15, Ll/᩸᩺ۚ;->ۧ:Ljava/lang/String;

    move-object/from16 v29, v1

    iget-object v1, v15, Ll/᩸᩺ۚ;->ᩴ:Ljava/lang/String;

    move-object/from16 v20, v6

    move-object/from16 v21, v5

    move-object/from16 v22, v8

    move-object/from16 v23, v9

    move-object/from16 v24, v1

    invoke-static/range {v20 .. v25}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "locator"

    .line 264
    invoke-virtual {v10, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 265
    invoke-virtual {v1, v2, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 277
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 311
    iget-object v5, v15, Ll/᩸᩺ۚ;->᩹:Ljava/lang/String;

    const-string v6, "zip_entries"

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v8, "dex_string"

    if-eqz v6, :cond_3

    const-string v6, "zip_entry_path"

    goto/16 :goto_3

    :cond_3
    const-string v6, "axml"

    .line 313
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const-string v6, "axml_text"

    goto/16 :goto_3

    :cond_4
    const-string v6, "resource_table_value"

    .line 315
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    const-string v9, "resource_table_file_path"

    .line 316
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "resource_table_id"

    .line 318
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-string v9, "resource_table_name"

    if-nez v6, :cond_e

    .line 319
    invoke-virtual {v9, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    const-string v6, "dex_class"

    .line 321
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v6, "dex_class_name"

    goto :goto_3

    :cond_7
    const-string v6, "dex_field"

    .line 323
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const-string v6, "dex_field_name"

    goto :goto_3

    :cond_8
    const-string v6, "dex_method"

    .line 325
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const-string v6, "dex_method_name"

    goto :goto_3

    .line 327
    :cond_9
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const-string v6, "dex_string_matches"

    goto :goto_3

    :cond_a
    const-string v6, "smali"

    .line 329
    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const-string v6, "smali_text"

    goto :goto_3

    .line 331
    :cond_b
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    const-string v6, "native_symbol_name"

    goto :goto_3

    .line 333
    :cond_c
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    move-object v6, v0

    goto :goto_3

    :cond_d
    move-object v6, v14

    goto :goto_3

    :cond_e
    :goto_2
    move-object v6, v9

    :cond_f
    :goto_3
    const-string v9, "kind"

    .line 278
    invoke-virtual {v2, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 279
    iget-object v6, v15, Ll/᩸᩺ۚ;->ۚ:Ljava/lang/String;

    if-eqz v6, :cond_10

    const-string v9, "matchKind"

    .line 280
    invoke-virtual {v2, v9, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    :cond_10
    if-eqz v5, :cond_11

    .line 282
    invoke-virtual {v13, v5}, Ll/ۧ᩵ۚ;->᩷(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_11

    const-string v6, "snippet"

    .line 283
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 285
    :cond_11
    iget v5, v15, Ll/᩸᩺ۚ;->۫:I

    if-ltz v5, :cond_12

    const-string v6, "line"

    .line 286
    invoke-virtual {v2, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "column"

    iget v9, v15, Ll/᩸᩺ۚ;->᩷:I

    .line 287
    invoke-virtual {v5, v6, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    :cond_12
    const-string v5, "end"

    const-string v6, "start"

    const-string v9, "textTruncated"

    const-string v10, "textStartOffset"

    move-object/from16 v20, v3

    const-string v3, "text"

    move-object/from16 v21, v12

    const-string v12, "matchOffsets"

    if-eqz v11, :cond_15

    move-object/from16 v22, v1

    .line 289
    iget-object v1, v15, Ll/᩸᩺ۚ;->ܶ:Ll/ۗ᩹ۚ;

    move-object/from16 v23, v4

    if-eqz v1, :cond_16

    .line 343
    invoke-virtual {v1}, Ll/ۗ᩹ۚ;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v13, v4}, Ll/ۧ᩵ۚ;->ۙ(Ljava/lang/String;)Ll/᩻᩵ۚ;

    move-result-object v4

    move/from16 v24, v11

    .line 344
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v11

    move-object/from16 v25, v13

    iget-object v13, v4, Ll/᩻᩵ۚ;->ۙ:Ljava/lang/String;

    .line 345
    invoke-virtual {v11, v3, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 346
    invoke-virtual {v1}, Ll/ۗ᩹ۚ;->ۙ()I

    move-result v13

    invoke-virtual {v11, v10, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 347
    invoke-virtual {v1}, Ll/ۗ᩹ۚ;->ۤ()Z

    move-result v13

    if-nez v13, :cond_14

    iget-boolean v4, v4, Ll/᩻᩵ۚ;->᩷:Z

    if-eqz v4, :cond_13

    goto :goto_4

    :cond_13
    const/4 v4, 0x0

    goto :goto_5

    :cond_14
    :goto_4
    const/4 v4, 0x1

    :goto_5
    invoke-virtual {v11, v9, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget v11, v1, Ll/ۗ᩹ۚ;->۫:I

    .line 348
    invoke-virtual {v4, v6, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v4

    iget v1, v1, Ll/ۗ᩹ۚ;->᩷:I

    .line 349
    invoke-virtual {v4, v5, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 344
    invoke-virtual {v2, v12, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_6

    :cond_15
    move-object/from16 v22, v1

    move-object/from16 v23, v4

    :cond_16
    move/from16 v24, v11

    move-object/from16 v25, v13

    .line 42
    :goto_6
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v4, "name"

    if-nez v1, :cond_18

    .line 43
    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_7

    :cond_17
    move-object v7, v12

    goto :goto_9

    .line 356
    :cond_18
    :goto_7
    iget-object v0, v15, Ll/᩸᩺ۚ;->᩻:Ll/ܰۛۚ;

    .line 357
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 358
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    const-string v7, "itemKind"

    .line 359
    iget-object v11, v0, Ll/ܰۛۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v1, v7, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    iget-object v11, v0, Ll/ܰۛۚ;->ܳ:Ljava/lang/String;

    .line 360
    invoke-virtual {v7, v4, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v11, "demangledName"

    iget-object v13, v0, Ll/ܰۛۚ;->᩷:Ljava/lang/String;

    .line 361
    invoke-virtual {v7, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v11, "imported"

    iget-boolean v13, v0, Ll/ܰۛۚ;->᩸:Z

    .line 362
    invoke-virtual {v7, v11, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    :cond_19
    move-object v7, v12

    .line 364
    iget-wide v11, v0, Ll/ܰۛۚ;->ۚ:J

    invoke-static {v11, v12}, Ll/ܺ᩵ۚ;->ۙ(J)Lbin/mt/json/JSONValue;

    move-result-object v11

    const-string v12, "virtualAddress"

    invoke-virtual {v1, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v11, v0, Ll/ܰۛۚ;->ۤ:J

    .line 365
    invoke-static {v11, v12}, Ll/ܺ᩵ۚ;->ۙ(J)Lbin/mt/json/JSONValue;

    move-result-object v11

    const-string v12, "fileOffset"

    invoke-virtual {v1, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget v11, v0, Ll/ܰۛۚ;->۫:I

    if-gez v11, :cond_1a

    .line 381
    sget-object v11, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    goto :goto_8

    .line 383
    :cond_1a
    invoke-static {v11}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v11

    :goto_8
    const-string v12, "readBytesByteOffset"

    .line 366
    invoke-virtual {v1, v12, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v11, "byteSize"

    iget-wide v12, v0, Ll/ܰۛۚ;->ۙ:J

    .line 367
    invoke-virtual {v1, v11, v12, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v11, "xrefAddressKind"

    iget-object v12, v0, Ll/ܰۛۚ;->ۧ:Ljava/lang/String;

    .line 368
    invoke-virtual {v1, v11, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-wide v11, v0, Ll/ܰۛۚ;->֫:J

    .line 369
    invoke-static {v11, v12}, Ll/ܺ᩵ۚ;->ۙ(J)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v11, "xrefAddress"

    invoke-virtual {v1, v11, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "nativeLocation"

    .line 293
    invoke-virtual {v2, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 295
    :goto_9
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, v15, Ll/᩸᩺ۚ;->ۤ:Ll/᩵ۛۚ;

    if-eqz v0, :cond_20

    iget-object v1, v0, Ll/᩵ۛۚ;->᩷:Ljava/util/ArrayList;

    .line 422
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v8

    .line 423
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ۗۛۚ;

    .line 424
    iget-object v13, v12, Ll/ۗۛۚ;->ۤ:Ljava/lang/String;

    move-object/from16 v14, v25

    invoke-virtual {v14, v13}, Ll/ۧ᩵ۚ;->᩷(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_1b

    goto :goto_c

    .line 427
    :cond_1b
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v25, v11

    iget-object v11, v12, Ll/ۗۛۚ;->ۤ:Ljava/lang/String;

    .line 428
    invoke-virtual {v13, v3, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    iget v13, v12, Ll/ۗۛۚ;->᩸:I

    .line 429
    invoke-virtual {v11, v10, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v11

    iget-boolean v13, v12, Ll/ۗۛۚ;->ᩴ:Z

    .line 430
    invoke-virtual {v11, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v11

    if-eqz v24, :cond_1c

    .line 432
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v13

    move-object/from16 v30, v3

    iget v3, v12, Ll/ۗۛۚ;->᩷:I

    .line 433
    invoke-virtual {v13, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget v12, v12, Ll/ۗۛۚ;->ۙ:I

    .line 434
    invoke-virtual {v3, v5, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 432
    invoke-virtual {v11, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_b

    :cond_1c
    move-object/from16 v30, v3

    .line 436
    :goto_b
    invoke-virtual {v8, v11}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v11, v25

    move-object/from16 v3, v30

    move-object/from16 v25, v14

    goto :goto_a

    :cond_1d
    move-object/from16 v14, v25

    :goto_c
    const-string v3, "matchCount"

    .line 411
    iget v5, v0, Ll/᩵ۛۚ;->ۙ:I

    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "matchedStrings"

    .line 412
    invoke-virtual {v3, v5, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-boolean v0, v0, Ll/᩵ۛۚ;->ۤ:Z

    if-nez v0, :cond_1f

    .line 414
    invoke-virtual {v8}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1e

    goto :goto_d

    :cond_1e
    const/4 v0, 0x0

    goto :goto_e

    :cond_1f
    :goto_d
    const/4 v0, 0x1

    :goto_e
    const-string v1, "matchedStringsTruncated"

    .line 413
    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    goto :goto_f

    :cond_20
    move-object/from16 v14, v25

    :goto_f
    if-eqz v23, :cond_21

    const-string v0, "type"

    move-object/from16 v1, v23

    .line 454
    iget-object v3, v1, Ll/۫ܶۚ;->ܳ:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, v1, Ll/۫ܶۚ;->᩷:Ljava/lang/String;

    .line 455
    invoke-virtual {v0, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 301
    :cond_21
    iget-object v0, v15, Ll/᩸᩺ۚ;->֫:Ll/᩵ܶۚ;

    if-eqz v0, :cond_23

    const-string v1, "variant"

    .line 463
    iget-object v3, v0, Ll/᩵ܶۚ;->᩻:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "valueKind"

    iget-object v4, v0, Ll/᩵ܶۚ;->֫:Ljava/lang/String;

    .line 464
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 465
    iget-object v3, v0, Ll/᩵ܶۚ;->ۧ:Ljava/lang/String;

    if-eqz v3, :cond_22

    invoke-virtual {v14, v3}, Ll/ۧ᩵ۚ;->᩷(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_22

    goto :goto_10

    :cond_22
    const/4 v3, 0x0

    :goto_10
    const-string v4, "valueSnippet"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "styled"

    iget-boolean v4, v0, Ll/᩵ܶۚ;->ܳ:Z

    .line 467
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "truncated"

    iget-boolean v4, v0, Ll/᩵ܶۚ;->ۚ:Z

    .line 468
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "matchField"

    iget-object v4, v0, Ll/᩵ܶۚ;->ᩴ:Ljava/lang/String;

    .line 469
    invoke-virtual {v1, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "zip_entry"

    iget-object v4, v0, Ll/᩵ܶۚ;->ۙ:Ljava/lang/String;

    .line 470
    invoke-static {v3, v4}, Ll/ۘ᩵ۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const-string v4, "fileLocator"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v3, v0, Ll/᩵ܶۚ;->۫:Ljava/lang/String;

    const-string v4, "resource"

    .line 471
    invoke-static {v4, v3}, Ll/ۘ᩵ۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    const-string v5, "targetLocator"

    invoke-virtual {v1, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "itemKey"

    iget-object v5, v0, Ll/᩵ܶۚ;->᩷:Ljava/lang/String;

    .line 472
    invoke-virtual {v1, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "itemValueKind"

    iget-object v5, v0, Ll/᩵ܶۚ;->᩸:Ljava/lang/String;

    .line 473
    invoke-virtual {v1, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object v0, v0, Ll/᩵ܶۚ;->ۤ:Ljava/lang/String;

    .line 474
    invoke-static {v4, v0}, Ll/ۘ᩵ۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v3, "itemKeyLocator"

    invoke-virtual {v1, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_23
    const-string v0, "hit"

    move-object/from16 v1, v22

    .line 266
    invoke-virtual {v1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v21

    .line 267
    invoke-virtual {v1, v0}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    move-object v12, v1

    move-object v13, v14

    move-object/from16 v4, v16

    move/from16 v7, v17

    move-object/from16 v10, v18

    move-object/from16 v6, v19

    move-object/from16 v3, v20

    move/from16 v11, v24

    move-object/from16 v5, v26

    move-object/from16 v8, v27

    move-object/from16 v9, v28

    move-object/from16 v1, v29

    move-object/from16 v14, p2

    goto/16 :goto_0

    :cond_24
    const-string v0, "NATIVE_ANALYZER_INVALID_RESULT"

    const-string v1, "Native search returned an invalid structured location."

    .line 260
    invoke-static {v0, v1}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    :cond_25
    move-object/from16 v29, v1

    move-object/from16 v20, v3

    move-object/from16 v16, v4

    move-object/from16 v26, v5

    move-object/from16 v19, v6

    move/from16 v17, v7

    move-object/from16 v27, v8

    move-object/from16 v28, v9

    move-object/from16 v18, v10

    move/from16 v24, v11

    move-object v1, v12

    const-string v0, "data"

    .line 224
    invoke-virtual {v3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, v29

    iget v3, v1, Ll/ᩴ᩺ۚ;->ᩴ:I

    const-string v4, "native_symbols"

    move-object/from16 v5, v28

    .line 400
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "message"

    const-string v7, "code"

    if-nez v4, :cond_26

    const-string v4, "native_strings"

    .line 401
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_27

    :cond_26
    if-eqz v27, :cond_27

    .line 388
    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_27

    if-nez v3, :cond_27

    const-string v3, "native_prefix_no_so_candidates"

    const-string v4, "The prefix filter matched no lib/**/*.so ZIP entries; native search prefix filters SO entry paths such as lib/arm64-v8a/, not symbol or string text."

    .line 0
    invoke-static {v7, v3, v6, v4}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    goto :goto_11

    :cond_27
    const-string v3, ""

    invoke-static {v7, v3, v6, v3}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    :goto_11
    const-string v4, "filterHint"

    .line 225
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 226
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    const-string v4, "nextActions"

    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 227
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_29

    .line 555
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    .line 556
    invoke-interface/range {v26 .. v26}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_12
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_28

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳ᩺ۚ;

    .line 557
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v10, v8, Ll/ܳ᩺ۚ;->ۤ:Ljava/lang/String;

    .line 558
    invoke-virtual {v9, v2, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "errorCode"

    iget-object v11, v8, Ll/ܳ᩺ۚ;->ۙ:Ljava/lang/String;

    .line 559
    invoke-virtual {v9, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v8, v8, Ll/ܳ᩺ۚ;->᩷:Ljava/lang/String;

    .line 560
    invoke-virtual {v9, v6, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    .line 557
    invoke-virtual {v3, v8}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_12

    :cond_28
    const-string v2, "skippedScopeErrors"

    .line 228
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 230
    :cond_29
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v19, :cond_2a

    const/4 v3, 0x1

    goto :goto_13

    :cond_2a
    const/4 v3, 0x0

    :goto_13
    const-string v6, "hasMore"

    .line 231
    invoke-virtual {v2, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "returnedCount"

    .line 232
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "limitMax"

    const/16 v6, 0xc8

    .line 233
    invoke-virtual {v2, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v7, "totalAvailableCount"

    const/4 v8, 0x0

    .line 234
    invoke-virtual {v2, v7, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    if-eqz v19, :cond_2d

    .line 236
    iget-object v8, v1, Ll/ᩴ᩺ۚ;->ܳ:Ljava/lang/String;

    move-object/from16 v1, p1

    iget-object v9, v1, Ll/ۤۛۚ;->ۤ:Ljava/lang/String;

    .line 237
    sget v7, Ll/ۘ᩵ۚ;->ۙ:I

    .line 1514
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v10, "query"

    iget-object v11, v1, Ll/ۤۛۚ;->᩻:Ljava/lang/String;

    .line 1515
    invoke-virtual {v7, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const-string v10, "recommendedLimit"

    move/from16 v13, v17

    .line 1516
    invoke-virtual {v7, v10, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v7

    .line 1517
    invoke-virtual {v7, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/ۤۛۚ;->֫:Ll/ۨ᩹ۚ;

    iget-object v7, v6, Ll/ۨ᩹ۚ;->ᩴ:Ljava/lang/String;

    const-string v10, "queryType"

    .line 1518
    invoke-virtual {v3, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "caseSensitive"

    iget-boolean v10, v6, Ll/ۨ᩹ۚ;->ۙ:Z

    .line 1519
    invoke-virtual {v3, v7, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "matchMode"

    iget-object v6, v6, Ll/ۨ᩹ۚ;->ۤ:Ljava/lang/String;

    .line 1520
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/ۤۛۚ;->ܽ:Ljava/util/ArrayList;

    .line 1521
    invoke-static {v6}, Ll/ۨᩴۚ;->ۙ(Ljava/lang/Iterable;)Lbin/mt/json/JSONArray;

    move-result-object v6

    const-string v7, "scopes"

    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "includeSnippet"

    iget-boolean v7, v1, Ll/ۤۛۚ;->۫:Z

    .line 1522
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "snippetMaxChars"

    iget v7, v1, Ll/ۤۛۚ;->᩹:I

    .line 1523
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "explicitScopes"

    iget-boolean v7, v1, Ll/ۤۛۚ;->ᩴ:Z

    .line 1524
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "includeMatchOffsets"

    move/from16 v7, v24

    .line 1525
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "zipEntryPrefix"

    move-object/from16 v7, v27

    .line 1526
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "resourcePrefix"

    iget-object v7, v1, Ll/ۤۛۚ;->ܺ:Ljava/lang/String;

    .line 1527
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v6, v1, Ll/ۤۛۚ;->ۙ:Ll/᩷ۛۚ;

    iget-object v7, v6, Ll/᩷ۛۚ;->ۙ:Ljava/lang/String;

    const-string v10, "classPrefixMode"

    .line 1528
    invoke-virtual {v3, v10, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v7, "classPrefix"

    iget-object v6, v6, Ll/᩷ۛۚ;->᩷:Ljava/lang/String;

    .line 1529
    invoke-virtual {v3, v7, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "dexStringResultMode"

    iget-object v7, v1, Ll/ۤۛۚ;->᩷:Ljava/lang/String;

    .line 1530
    invoke-virtual {v3, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v11

    .line 1531
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2b

    const-string v3, "target"

    .line 1532
    invoke-virtual {v11, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 117
    :cond_2b
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "scopeIndex"

    move-object/from16 v6, v19

    iget v7, v6, Ll/ܰ᩹ۚ;->۫:I

    .line 118
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "entryIndex"

    iget v7, v6, Ll/ܰ᩹ۚ;->ۤ:I

    .line 119
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "classIndex"

    iget v7, v6, Ll/ܰ᩹ۚ;->᩷:I

    .line 120
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "memberIndex"

    iget v7, v6, Ll/ܰ᩹ۚ;->᩸:I

    .line 121
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "classCharOffset"

    iget v7, v6, Ll/ܰ᩹ۚ;->ۙ:I

    .line 122
    invoke-virtual {v3, v5, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 123
    iget v3, v6, Ll/ܰ᩹ۚ;->ܳ:I

    if-ltz v3, :cond_2c

    const-string v5, "nativeStringScanOffset"

    .line 124
    iget-wide v6, v6, Ll/ܰ᩹ۚ;->ᩴ:J

    invoke-virtual {v12, v5, v6, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;J)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "nativeStringTotalCount"

    .line 125
    invoke-virtual {v5, v6, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    :cond_2c
    const-string v7, "search"

    move/from16 v10, p3

    .line 236
    invoke-static/range {v7 .. v12}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "nextCursor"

    .line 239
    invoke-virtual {v2, v5, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 240
    invoke-virtual {v0, v4}, Lbin/mt/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v4

    iget-object v1, v1, Ll/ۤۛۚ;->ۗ:Ljava/lang/String;

    move-object/from16 v5, v16

    .line 242
    invoke-static {v1, v13, v5, v3}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "mt_apk_continue"

    const-string v5, "continue"

    const-string v6, "Continue searching next page"

    .line 240
    invoke-static {v1, v3, v5, v6}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v4, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    :cond_2d
    const-string v1, "pagination"

    .line 245
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 206
    invoke-static {v0}, Ll/ܶ᩵ۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 63
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 155
    invoke-static {p1}, Ll/ܶ᩵ۚ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 3

    .line 170
    :try_start_0
    invoke-static {p1}, Ll/ۘ᩵ۚ;->ܰ(Lbin/mt/json/JSONObject;)Ll/ۨ᩵ۚ;

    move-result-object v0

    const-string v1, "target"

    const-string v2, ""

    .line 171
    invoke-virtual {p1, v1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۘ᩹ۚ;->ۙ(Ljava/lang/String;)Ll/᩺᩹ۚ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 173
    :try_start_1
    iget-object v1, p0, Ll/ܺ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    iget-object v2, v0, Ll/ۨ᩵ۚ;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ll/֫ۨۚ;->᩸(Ljava/lang/String;)Ll/ۤ᩺ۚ;

    move-result-object v1

    .line 174
    invoke-static {v0, v1}, Ll/ۘ᩵ۚ;->ۙ(Ll/ۨ᩵ۚ;Ll/ۤ᩺ۚ;)Ll/ۤۛۚ;

    move-result-object v0

    .line 175
    new-instance v1, Ll/ۘ۫ۚ;

    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 175
    invoke-direct {p0, v0, v1, v2}, Ll/ܺ᩵ۚ;->ۙ(Ll/ۤۛۚ;Ll/ۘ۫ۚ;Ljava/lang/String;)Ll/֨ܳۚ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    :try_start_2
    invoke-virtual {p1}, Ll/᩺᩹ۚ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 178
    sget p1, Ll/᩺۫ۚ;->ۙ:I

    return-object v0

    :catchall_0
    move-exception v0

    .line 171
    :try_start_3
    invoke-virtual {p1}, Ll/᩺᩹ۚ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 178
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 179
    throw p1
.end method

.method public final ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;Ll/ۘ۫ۚ;)Ll/֨ܳۚ;
    .locals 4

    const-string v0, "workspaceId"

    const/4 v1, 0x0

    .line 187
    invoke-virtual {p2, v0, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "editSessionId"

    const-string v3, ""

    .line 188
    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 187
    invoke-static {v0, v2, p1, p2}, Ll/ۘ᩵ۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/ۤۛۚ;

    move-result-object p1

    .line 189
    iget-object v0, p1, Ll/ۤۛۚ;->ܶ:Ljava/lang/String;

    invoke-static {v0}, Ll/ۤۤۚ;->᩷(Ljava/lang/String;)V

    .line 190
    invoke-static {v0}, Ll/ۘ᩹ۚ;->ۙ(Ljava/lang/String;)Ll/᩺᩹ۚ;

    move-result-object v0

    :try_start_0
    const-string v2, "nextCursor"

    .line 191
    invoke-virtual {p2, v2, v1}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p3, p2}, Ll/ܺ᩵ۚ;->ۙ(Ll/ۤۛۚ;Ll/ۘ۫ۚ;Ljava/lang/String;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    invoke-virtual {v0}, Ll/᩺᩹ۚ;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 190
    :try_start_1
    invoke-virtual {v0}, Ll/᩺᩹ۚ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ܺ᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to search the edited session; pass an empty string to search the base workspace.\"\n  },\n  \"target\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"overview\",\n      \"files\",\n      \"resource_table_names\",\n      \"resource_table_values\",\n      \"resource_table_file_paths\",\n      \"dex_names\",\n      \"dex_strings\",\n      \"dex_string_members\",\n      \"smali\",\n      \"native_symbols\",\n      \"native_strings\"\n    ],\n    \"description\": \"Search target. Use overview when the target is unknown; it searches ZIP entry paths, decoded AXML, resource ids/names/decoded values, dex names, and dex strings when available, but not smali, native_symbols, native_strings, or the dedicated resource_table_file_paths target. Use files for ZIP entry paths and decoded AXML text, resource_table_names for resource ids/names, resource_table_values for decoded resource values, resource_table_file_paths only when specifically looking for resource values that point to APK ZIP entry paths, dex_names for class/field/method names, dex_strings for dex string values/literals grouped by class, dex_string_members for dex string values/literals grouped by field or method, smali for disassembled class text, native_symbols for raw and C++ demangled ELF import/symbol/relocation names plus raw entry names in lib/**/*.so, and native_strings for printable strings reported from ELF files. dex_strings and dex_string_members do not search the entire DEX string pool or symbol names/signatures unless they occur as string values; use dex_names for names and smali for signatures.\"\n  },\n  \"query\": {\n    \"type\": \"string\",\n    \"description\": \"Text or regex pattern to search. queryType selects literal vs regex; caseSensitive and matchMode control matching.\"\n  },\n  \"queryType\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"literal\",\n      \"regex\"\n    ],\n    \"description\": \"Controls how query is interpreted.\"\n  },\n  \"caseSensitive\": {\n    \"type\": \"boolean\",\n    \"description\": \"Whether query matching is case-sensitive. Applies to literal and regex query matching only; prefix filtering is always literal and case-sensitive.\"\n  },\n  \"matchMode\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"contains\",\n      \"exact\"\n    ],\n    \"description\": \"Controls whether query can match a substring or must match an entire searchable value. Use contains by default. exact is invalid when target=smali.\"\n  },\n  \"prefix\": {\n    \"type\": \"string\",\n    \"description\": \"Required candidate prefix filter; pass \\\"\\\" for no filter. overview requires \\\"\\\". For files, this is an APK ZIP entry path prefix like res/layout/. For native_symbols and native_strings, this is the SO ZIP entry path prefix such as lib/arm64-v8a/; it is not a symbol or string text prefix. For resource_table_* targets, match resource locator targets like 0x7f010000, type/name, or name; only 0x resource ids are case-insensitive. For dex_names, dex_strings, dex_string_members, and smali, this is a dex class owner prefix; pass a Java package, slash prefix, L-prefix, or full descriptor.\"\n  },\n  \"includeMatchOffsets\": {\n    \"type\": \"boolean\",\n    \"description\": \"When true, include hit.matchOffsets and matchedStrings[].matchOffsets. Offsets are zero-based UTF-16 positions in the original searched candidate, with end exclusive. Each text preview has a textStartOffset; subtract it from start/end to locate the match within the preview. Long matches may extend beyond the preview. Name candidates may use decoded or normalized aliases, so offsets are not byte offsets or edit ranges. Use data.hits[i].hit.nativeLocation.name as the raw native namePrefix source. Pass false normally, or true to inspect exact match spans.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum hits on this first page. Recommended value is 50; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  },\n  \"snippetMaxChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum snippet length per hit. Recommended value is 240; maximum 1000 is enforced at runtime. Use 0 to disable snippets. For native hits, snippet is readable context only; data.hits[i].hit.nativeLocation remains available for follow-up parameters even when snippets are disabled or suppressed.\"\n  }\n}\n"

    .line 71
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Search APK"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 144
    iget-object v0, p0, Ll/ܺ᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 147
    :cond_0
    invoke-static {}, Ll/ܶ᩵ۚ;->ܳ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܺ᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Search when the APK target is unknown. First call: target=overview, queryType=literal, caseSensitive=false, matchMode=contains, prefix=\"\", includeMatchOffsets=false, limit=50, snippetMaxChars=240; pass editSessionId=\"\" for the base APK. overview covers ZIP paths, decoded AXML, resource ids/names/values, dex names, and dex strings when available. Read notSearchedTargets and filterHint before treating zero hits as absence; select smali, native_symbols, native_strings, or resource_table_file_paths explicitly when needed. For native targets, prefix filters the SO entry path, not symbol names. Copy data.hits[i].locator for follow-up calls. Use mt_apk_dex_read_pseudocode for Java pseudocode of dex_class and dex_method targets; use mt_apk_read_text for Smali verification or editing. For native follow-up calls, use data.hits[i].hit.nativeLocation and its field descriptions; snippet is readable context only. Continue with mt_apk_continue when pagination.hasMore=true; totalAvailableCount=null means unknown. Narrow query or prefix to reduce scan work; limit only controls page size."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_search"

    return-object v0
.end method

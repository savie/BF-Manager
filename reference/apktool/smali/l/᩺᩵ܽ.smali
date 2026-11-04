.class public final Ll/᩺᩵ܽ;
.super Ljava/lang/Object;
.source "688Y"


# instance fields
.field public final ֫:Ljava/lang/ThreadLocal;

.field public final ۙ:Ljava/util/List;

.field public final ۚ:Ljava/util/List;

.field public final ۤ:Ll/᩺ۨܽ;

.field public final ۧ:Ll/ܽ֫ۗ;

.field public final ۫:Ll/֫᩺ܽ;

.field public final ܳ:Z

.field public final ᩴ:Ll/ۨ᩵ܽ;

.field public final ᩷:Ljava/util/List;

.field public final ᩸:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 244
    sget-object v0, Ll/ۘ᩵ܽ;->ܶ:Ll/ۘ᩵ܽ;

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    new-instance v1, Ljava/lang/ThreadLocal;

    invoke-direct {v1}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v1, p0, Ll/᩺᩵ܽ;->֫:Ljava/lang/ThreadLocal;

    .line 175
    new-instance v1, Ll/ܽ֫ۗ;

    invoke-direct {v1}, Ll/ܽ֫ۗ;-><init>()V

    iput-object v1, p0, Ll/᩺᩵ܽ;->ۧ:Ll/ܽ֫ۗ;

    .line 248
    iget-object v1, v0, Ll/ۘ᩵ܽ;->ۤ:Ll/ܰۨܽ;

    .line 250
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, v0, Ll/ۘ᩵ܽ;->ۚ:Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 254
    iget-boolean v1, v0, Ll/ۘ᩵ܽ;->᩷:Z

    iput-boolean v1, p0, Ll/᩺᩵ܽ;->ܳ:Z

    .line 255
    iget-object v1, v0, Ll/ۘ᩵ܽ;->ܳ:Ll/ۨ᩵ܽ;

    iput-object v1, p0, Ll/᩺᩵ܽ;->ᩴ:Ll/ۨ᩵ܽ;

    .line 263
    iget-object v1, v0, Ll/ۘ᩵ܽ;->᩸:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘ᩵ܽ;->ۙ(Ljava/util/AbstractCollection;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩺᩵ܽ;->ۙ:Ljava/util/List;

    .line 264
    iget-object v1, v0, Ll/ۘ᩵ܽ;->۫:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘ᩵ܽ;->ۙ(Ljava/util/AbstractCollection;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/᩺᩵ܽ;->᩷:Ljava/util/List;

    .line 267
    iget-object v0, v0, Ll/ۘ᩵ܽ;->ܺ:Ljava/util/ArrayDeque;

    invoke-static {v0}, Ll/ۘ᩵ܽ;->ۙ(Ljava/util/AbstractCollection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll/᩺᩵ܽ;->ۚ:Ljava/util/List;

    .line 269
    sget-object v0, Ll/ۘ᩵ܽ;->᩹:Ll/᩺ۨܽ;

    iput-object v0, p0, Ll/᩺᩵ܽ;->ۤ:Ll/᩺ۨܽ;

    .line 270
    sget-object v0, Ll/ۘ᩵ܽ;->ۨ:Ll/֫᩺ܽ;

    iput-object v0, p0, Ll/᩺᩵ܽ;->۫:Ll/֫᩺ܽ;

    .line 271
    sget-object v0, Ll/ۘ᩵ܽ;->ۘ:Ljava/util/List;

    iput-object v0, p0, Ll/᩺᩵ܽ;->᩸:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1280
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:false,factories:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩵ܽ;->᩸:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/᩺᩵ܽ;->ۤ:Ll/᩺ۨܽ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 2
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;

    .line 851
    invoke-static {v0}, Ll/ۛܰܽ;->ۙ(Ljava/lang/Class;)Ll/ۛܰܽ;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 913
    :cond_0
    new-instance v2, Ljava/io/StringReader;

    invoke-direct {v2, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 822
    new-instance p1, Ll/ۘܰܽ;

    invoke-direct {p1, v2}, Ll/ۘܰܽ;-><init>(Ljava/io/StringReader;)V

    .line 823
    sget-object v2, Ll/ᩴۨܽ;->᩶:Ll/ᩴۨܽ;

    invoke-virtual {p1, v2}, Ll/ۘܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    const-string v3, "AssertionError (Gson 2.15.0): "

    const-string v4, "Type adapter \'"

    .line 1090
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܶ()Ll/ᩴۨܽ;

    move-result-object v5

    .line 1094
    invoke-virtual {p1}, Ll/ۘܰܽ;->ܶ()Ll/ᩴۨܽ;

    move-result-object v6

    if-ne v6, v2, :cond_1

    .line 1096
    sget-object v2, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    invoke-virtual {p1, v2}, Ll/ۘܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 1100
    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    .line 1102
    :try_start_1
    invoke-virtual {p0, v0}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v6

    .line 1103
    invoke-virtual {v6, p1}, Ll/ܽۨܽ;->ۙ(Ll/ۘܰܽ;)Ljava/lang/Object;

    move-result-object v7

    .line 1104
    invoke-virtual {v0}, Ll/ۛܰܽ;->ۙ()Ljava/lang/Class;

    move-result-object v8

    invoke-static {v8}, Ll/۠ۙܺ;->ۙ(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v8

    if-eqz v7, :cond_3

    .line 1105
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    .line 1106
    :cond_2
    new-instance v8, Ljava/lang/ClassCastException;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "\' returned wrong type; requested "

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1110
    invoke-virtual {v0}, Ll/ۛܰܽ;->ۙ()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " but got instance of "

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1112
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\nVerify that the adapter was registered for the correct type."

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1134
    :cond_3
    :goto_0
    invoke-virtual {p1, v5}, Ll/ۘܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    move-object v1, v7

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    .line 1131
    :try_start_2
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1132
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :catch_2
    move-exception v0

    .line 1129
    new-instance v1, Ll/ۜ᩵ܽ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1129
    throw v1

    :catch_3
    move-exception v0

    .line 1126
    new-instance v1, Ll/ۜ᩵ܽ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1126
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_4
    move-exception v0

    const/4 v2, 0x1

    :goto_1
    if-eqz v2, :cond_6

    .line 1134
    invoke-virtual {p1, v5}, Ll/ۘܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    :goto_2
    if-eqz v1, :cond_5

    .line 1221
    :try_start_3
    invoke-virtual {p1}, Ll/ۘܰܽ;->֨()Ll/ܰܰܽ;

    move-result-object p1

    sget-object v0, Ll/ܰܰܽ;->ᩳ:Ll/ܰܰܽ;

    if-ne p1, v0, :cond_4

    goto :goto_3

    .line 1222
    :cond_4
    new-instance p1, Ll/ۜ᩵ܽ;

    const-string v0, "JSON document was not fully consumed."

    .line 42
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1222
    throw p1
    :try_end_3
    .catch Ll/ܿܰܽ; {:try_start_3 .. :try_end_3} :catch_6
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    :catch_5
    move-exception p1

    .line 1227
    new-instance v0, Ll/۟᩵ܽ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1227
    throw v0

    :catch_6
    move-exception p1

    .line 1225
    new-instance v0, Ll/ۜ᩵ܽ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1225
    throw v0

    :cond_5
    :goto_3
    return-object v1

    .line 1124
    :cond_6
    :try_start_4
    new-instance v1, Ll/ۜ᩵ܽ;

    .line 62
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1124
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1134
    :goto_4
    invoke-virtual {p1, v5}, Ll/ۘܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 1135
    throw v0
.end method

.method public final ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;
    .locals 8

    const-string v0, "type must not be null"

    .line 341
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 342
    iget-object v0, p0, Ll/᩺᩵ܽ;->ۧ:Ll/ܽ֫ۗ;

    invoke-virtual {v0, p1}, Ll/ܽ֫ۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨܽ;

    if-eqz v1, :cond_0

    return-object v1

    .line 349
    :cond_0
    iget-object v1, p0, Ll/᩺᩵ܽ;->֫:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_1

    .line 352
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 353
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    const/4 v3, 0x1

    goto :goto_0

    .line 358
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۨܽ;

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    const/4 v3, 0x0

    .line 366
    :goto_0
    :try_start_0
    new-instance v4, Ll/ۛ᩵ܽ;

    invoke-direct {v4}, Ll/ۛ᩵ܽ;-><init>()V

    .line 367
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    iget-object v5, p0, Ll/᩺᩵ܽ;->᩸:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܶۨܽ;

    .line 370
    invoke-interface {v6, p0, p1}, Ll/ܶۨܽ;->ۙ(Ll/᩺᩵ܽ;Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 372
    invoke-virtual {v4, v6}, Ll/ۛ᩵ܽ;->ۙ(Ll/ܽۨܽ;)V

    .line 374
    invoke-interface {v2, p1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    if-eqz v3, :cond_5

    .line 380
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    :cond_5
    if-eqz v6, :cond_7

    if-eqz v3, :cond_6

    .line 396
    invoke-virtual {v0, v2}, Ll/ܽ֫ۗ;->putAll(Ljava/util/Map;)V

    :cond_6
    return-object v6

    .line 385
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Gson (2.15.0) cannot handle "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    if-eqz v3, :cond_8

    .line 380
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 382
    :cond_8
    throw p1
.end method

.method public final ۙ(Ll/ܶۨܽ;Ll/ۛܰܽ;)Ll/ܽۨܽ;
    .locals 3

    const-string v0, "skipPast must not be null"

    .line 473
    invoke-static {p1, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "type must not be null"

    .line 474
    invoke-static {p2, v0}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 476
    iget-object v0, p0, Ll/᩺᩵ܽ;->۫:Ll/֫᩺ܽ;

    invoke-virtual {v0, p1, p2}, Ll/֫᩺ܽ;->ۙ(Ll/ܶۨܽ;Ll/ۛܰܽ;)Z

    move-result v1

    if-eqz v1, :cond_0

    move-object p1, v0

    .line 481
    :cond_0
    iget-object v0, p0, Ll/᩺᩵ܽ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶۨܽ;

    if-nez v1, :cond_2

    if-ne v2, p1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    .line 491
    :cond_2
    invoke-interface {v2, p0, p2}, Ll/ܶۨܽ;->ۙ(Ll/᩺᩵ܽ;Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v2

    :cond_3
    if-nez v1, :cond_4

    .line 501
    invoke-virtual {p0, p2}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p1

    return-object p1

    .line 498
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Gson cannot serialize or deserialize "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۙ(Ljava/io/Writer;)Ll/᩶ܰܽ;
    .locals 1

    .line 801
    new-instance v0, Ll/᩶ܰܽ;

    invoke-direct {v0, p1}, Ll/᩶ܰܽ;-><init>(Ljava/io/Writer;)V

    .line 802
    iget-object p1, p0, Ll/᩺᩵ܽ;->ᩴ:Ll/ۨ᩵ܽ;

    invoke-virtual {v0, p1}, Ll/᩶ܰܽ;->ۙ(Ll/ۨ᩵ܽ;)V

    .line 803
    iget-boolean p1, p0, Ll/᩺᩵ܽ;->ܳ:Z

    invoke-virtual {v0, p1}, Ll/᩶ܰܽ;->ۙ(Z)V

    .line 804
    sget-object p1, Ll/ᩴۨܽ;->᩶:Ll/ᩴۨܽ;

    invoke-virtual {v0, p1}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    const/4 p1, 0x0

    .line 805
    invoke-virtual {v0, p1}, Ll/᩶ܰܽ;->᩷(Z)V

    return-object v0
.end method

.method public final ۙ(Ljava/lang/Object;Ljava/lang/Class;Ll/᩶ܰܽ;)V
    .locals 5

    const-string v0, "AssertionError (Gson 2.15.0): "

    .line 672
    invoke-static {p2}, Ll/ۛܰܽ;->ۙ(Ljava/lang/reflect/Type;)Ll/ۛܰܽ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/᩺᩵ܽ;->ۙ(Ll/ۛܰܽ;)Ll/ܽۨܽ;

    move-result-object p2

    .line 674
    invoke-virtual {p3}, Ll/᩶ܰܽ;->ۚ()Ll/ᩴۨܽ;

    move-result-object v1

    .line 677
    invoke-virtual {p3}, Ll/᩶ܰܽ;->ۚ()Ll/ᩴۨܽ;

    move-result-object v2

    sget-object v3, Ll/ᩴۨܽ;->᩶:Ll/ᩴۨܽ;

    if-ne v2, v3, :cond_0

    .line 679
    sget-object v2, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    invoke-virtual {p3, v2}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 682
    :cond_0
    invoke-virtual {p3}, Ll/᩶ܰܽ;->ܽ()Z

    move-result v2

    .line 683
    invoke-virtual {p3}, Ll/᩶ܰܽ;->۫()Z

    move-result v3

    .line 685
    iget-boolean v4, p0, Ll/᩺᩵ܽ;->ܳ:Z

    invoke-virtual {p3, v4}, Ll/᩶ܰܽ;->ۙ(Z)V

    const/4 v4, 0x0

    .line 686
    invoke-virtual {p3, v4}, Ll/᩶ܰܽ;->᩷(Z)V

    .line 688
    :try_start_0
    invoke-virtual {p2, p3, p1}, Ll/ܽۨܽ;->ۙ(Ll/᩶ܰܽ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 695
    invoke-virtual {p3, v1}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 696
    invoke-virtual {p3, v2}, Ll/᩶ܰܽ;->ۙ(Z)V

    .line 697
    invoke-virtual {p3, v3}, Ll/᩶ܰܽ;->᩷(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 692
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 693
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 690
    new-instance p2, Ll/۟᩵ܽ;

    .line 62
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 690
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 695
    :goto_0
    invoke-virtual {p3, v1}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 696
    invoke-virtual {p3, v2}, Ll/᩶ܰܽ;->ۙ(Z)V

    .line 697
    invoke-virtual {p3, v3}, Ll/᩶ܰܽ;->᩷(Z)V

    .line 698
    throw p1
.end method

.method public final ۙ(Ll/֡᩵ܽ;Ll/᩶ܰܽ;)V
    .locals 6

    const-string v0, "AssertionError (Gson 2.15.0): "

    .line 752
    invoke-virtual {p2}, Ll/᩶ܰܽ;->ۚ()Ll/ᩴۨܽ;

    move-result-object v1

    .line 753
    invoke-virtual {p2}, Ll/᩶ܰܽ;->ܽ()Z

    move-result v2

    .line 754
    invoke-virtual {p2}, Ll/᩶ܰܽ;->۫()Z

    move-result v3

    .line 756
    iget-boolean v4, p0, Ll/᩺᩵ܽ;->ܳ:Z

    invoke-virtual {p2, v4}, Ll/᩶ܰܽ;->ۙ(Z)V

    const/4 v4, 0x0

    .line 757
    invoke-virtual {p2, v4}, Ll/᩶ܰܽ;->᩷(Z)V

    .line 761
    invoke-virtual {p2}, Ll/᩶ܰܽ;->ۚ()Ll/ᩴۨܽ;

    move-result-object v4

    sget-object v5, Ll/ᩴۨܽ;->᩶:Ll/ᩴۨܽ;

    if-ne v4, v5, :cond_0

    .line 763
    sget-object v4, Ll/ᩴۨܽ;->ܿ:Ll/ᩴۨܽ;

    invoke-virtual {p2, v4}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 70
    :cond_0
    :try_start_0
    sget-object v4, Ll/᩻᩺ܽ;->ۙ:Ll/᩻᩺ܽ;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p2}, Ll/᩻᩺ܽ;->ۙ(Ll/֡᩵ܽ;Ll/᩶ܰܽ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 774
    invoke-virtual {p2, v1}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 775
    invoke-virtual {p2, v2}, Ll/᩶ܰܽ;->ۙ(Z)V

    .line 776
    invoke-virtual {p2, v3}, Ll/᩶ܰܽ;->᩷(Z)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 771
    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 772
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :catch_1
    move-exception p1

    .line 769
    new-instance v0, Ll/۟᩵ܽ;

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 769
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 774
    :goto_0
    invoke-virtual {p2, v1}, Ll/᩶ܰܽ;->ۙ(Ll/ᩴۨܽ;)V

    .line 775
    invoke-virtual {p2, v2}, Ll/᩶ܰܽ;->ۙ(Z)V

    .line 776
    invoke-virtual {p2, v3}, Ll/᩶ܰܽ;->᩷(Z)V

    .line 777
    throw p1
.end method

.class public Ll/ܶᩴۚ;
.super Ll/֨᩻ܳ;
.source "C7AH"


# instance fields
.field public final ۗ:Ll/ܽᩴۚ;

.field public final ܶ:Ll/۫ܳۚ;

.field public final ܺ:Ljava/lang/String;

.field public final ܽ:Ll/᩵ᩴۚ;

.field public final ᩵:Ljava/lang/String;

.field public final ᩹:Ll/ܺᩴۚ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(ILl/ܺᩴۚ;Lbin/mt/json/JSONObject;Ll/ۡܳۚ;Ll/۫ܳۚ;Ll/ܶۘۚ;)V
    .locals 2

    .line 52
    invoke-direct {p0, p1}, Ll/֨᩻ܳ;-><init>(I)V

    const-string v0, "/mcp"

    .line 53
    iput-object v0, p0, Ll/ܶᩴۚ;->ܺ:Ljava/lang/String;

    .line 54
    iput p1, p0, Ll/ܶᩴۚ;->᩻:I

    const-string p1, "protocolVersions"

    .line 55
    invoke-static {p2, p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    iput-object p2, p0, Ll/ܶᩴۚ;->᩹:Ll/ܺᩴۚ;

    const-string p1, "MCP"

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "name"

    .line 289
    invoke-virtual {p3, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 290
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 291
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 292
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    move-object p1, v0

    .line 57
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/ܶᩴۚ;->᩵:Ljava/lang/String;

    .line 59
    iput-object p5, p0, Ll/ܶᩴۚ;->ܶ:Ll/۫ܳۚ;

    const-string p1, "requestAuthenticator"

    .line 60
    invoke-static {p6, p1}, Ll/ܽۚۗ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p6, p0, Ll/ܶᩴۚ;->ۗ:Ll/ܽᩴۚ;

    .line 61
    new-instance p1, Ll/᩵ᩴۚ;

    invoke-direct {p1, p2, p3, p4}, Ll/᩵ᩴۚ;-><init>(Ll/ܺᩴۚ;Lbin/mt/json/JSONObject;Ll/ۡܳۚ;)V

    iput-object p1, p0, Ll/ܶᩴۚ;->ܽ:Ll/᩵ᩴۚ;

    return-void
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 1

    const-string v0, "method"

    .line 398
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 399
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V
    .locals 6

    .line 416
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "content-length"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 419
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    .line 424
    :cond_1
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "transfer-encoding"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    .line 406
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->ܽ()Z

    move-result p0

    if-nez p0, :cond_2

    .line 407
    invoke-virtual {p1}, Ll/ܿ᩻ܳ;->ۙ()V

    :cond_2
    return-void
.end method

.method public static ۤ(Ljava/lang/String;)V
    .locals 4

    if-nez p0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 328
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 329
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/16 v3, 0x800

    if-ge v2, v3, :cond_2

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    .line 332
    :cond_2
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v2

    if-eqz v2, :cond_3

    add-int/lit8 v2, v0, 0x1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 333
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v3

    if-eqz v3, :cond_3

    add-int/lit8 v1, v1, 0x4

    move v0, v2

    goto :goto_1

    :cond_3
    add-int/lit8 v1, v1, 0x3

    :goto_1
    const/high16 v2, 0x800000

    if-gt v1, v2, :cond_4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 339
    :cond_4
    new-instance p0, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->ۧۙ:Ll/᩶᩻ܳ;

    const-string v1, "Request body too large"

    invoke-direct {p0, v0, v1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    return-void
.end method

.method private ᩴ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 17

    move-object/from16 v1, p0

    const-string v2, "Invalid Request"

    const-string v3, "text/plain; charset=UTF-8"

    .line 103
    :try_start_0
    invoke-static/range {p1 .. p1}, Ll/ܶᩴۚ;->᩸(Ll/ۗ᩻ܳ;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 121
    :try_start_1
    invoke-static {v0}, Lbin/mt/json/JSON;->parse(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0
    :try_end_1
    .catch Lbin/mt/json/JSONParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 125
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v4

    const-string v5, "error"

    const-string v6, "result"

    const-string v7, "method"

    const-string v8, "mcp-protocol-version"

    const-string v9, ""

    const-string v10, "2025-03-26"

    iget-object v11, v1, Ll/ܶᩴۚ;->ܽ:Ll/᩵ᩴۚ;

    const-string v12, "initialize"

    const-string v13, "Invalid MCP-Protocol-Version"

    iget-object v14, v1, Ll/ܶᩴۚ;->᩹:Ll/ܺᩴۚ;

    const-string v15, "id"

    if-eqz v4, :cond_10

    .line 126
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 390
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v4

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_0

    move-object v4, v10

    .line 150
    :cond_0
    invoke-virtual {v14, v4}, Ll/ܺᩴۚ;->᩷(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_1

    .line 151
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v3, -0x7f58

    invoke-static {v0, v2, v3, v13}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    :cond_1
    const/16 v8, -0x7f58

    .line 154
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 155
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const-string v3, "Batch requests are not supported"

    invoke-static {v0, v2, v8, v3}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 158
    :cond_2
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    if-nez v4, :cond_3

    .line 159
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    invoke-static {v0, v3, v8, v2}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 165
    :cond_3
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lbin/mt/json/JSONValue;

    .line 166
    invoke-virtual {v13}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-virtual {v13}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v14

    .line 216
    invoke-virtual {v14, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v16

    if-nez v16, :cond_6

    .line 217
    invoke-virtual {v14, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v16

    if-nez v16, :cond_4

    invoke-virtual {v14, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v14

    if-eqz v14, :cond_6

    .line 167
    :cond_4
    invoke-virtual {v13}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v8

    invoke-static {v8}, Ll/ܶᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 168
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v2, "Invalid JSON-RPC response batch"

    .line 45
    invoke-static {v0, v3, v2}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    :cond_5
    const/4 v8, 0x1

    goto :goto_0

    :cond_6
    const/4 v10, 0x1

    goto :goto_0

    :cond_7
    if-eqz v8, :cond_9

    if-eqz v10, :cond_8

    .line 178
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v2, "JSON-RPC response batches cannot contain requests or notifications"

    .line 45
    invoke-static {v0, v3, v2}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 181
    :cond_8
    sget-object v0, Ll/᩶᩻ܳ;->֡:Ll/᩶᩻ܳ;

    .line 38
    invoke-static {v0, v3, v9}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 184
    :cond_9
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v4

    .line 185
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbin/mt/json/JSONValue;

    .line 186
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v6

    if-nez v6, :cond_b

    .line 187
    sget-object v5, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v6, -0x7f58

    invoke-static {v6, v5, v2}, Ll/ᩴܳۚ;->ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 191
    :cond_b
    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 193
    invoke-static {v5}, Ll/ܶᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const-string v6, "jsonrpc"

    .line 242
    invoke-virtual {v5, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    .line 243
    invoke-virtual {v5, v15}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v7

    if-nez v7, :cond_c

    if-eqz v6, :cond_c

    .line 245
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v7

    if-eqz v7, :cond_c

    const-string v7, "2.0"

    .line 246
    invoke-virtual {v6}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 247
    invoke-static {v5}, Ll/ܶᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_c

    goto :goto_1

    .line 195
    :cond_c
    invoke-virtual {v5, v15}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v5

    const-string v6, "Initialize requests must not be batched"

    const/16 v7, -0x7f58

    invoke-static {v7, v5, v6}, Ll/ᩴܳۚ;->ۙ(ILbin/mt/json/JSONValue;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 201
    :cond_d
    invoke-virtual {v11, v5}, Ll/᩵ᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Ll/ۗᩴۚ;

    move-result-object v5

    invoke-virtual {v5}, Ll/ۗᩴۚ;->ۙ()Lbin/mt/json/JSONValue;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 203
    invoke-virtual {v4, v5}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_1

    .line 206
    :cond_e
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    if-nez v0, :cond_f

    .line 207
    sget-object v0, Ll/᩶᩻ܳ;->֡:Ll/᩶᩻ܳ;

    .line 38
    invoke-static {v0, v3, v9}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 209
    :cond_f
    sget-object v0, Ll/᩶᩻ܳ;->ۚۙ:Ll/᩶᩻ܳ;

    const-string v2, "application/json"

    .line 31
    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 128
    :cond_10
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v4

    if-nez v4, :cond_11

    .line 129
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v4, -0x7f58

    invoke-static {v0, v3, v4, v2}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 132
    :cond_11
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 133
    invoke-static {v0}, Ll/ܶᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    .line 134
    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    .line 390
    invoke-virtual/range {p1 .. p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v2

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_12

    goto :goto_2

    :cond_12
    move-object v10, v2

    .line 383
    :goto_2
    invoke-virtual {v14, v10}, Ll/ܺᩴۚ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_13

    .line 135
    sget-object v2, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    invoke-virtual {v0, v15}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const/16 v3, -0x7f58

    invoke-static {v2, v0, v3, v13}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 216
    :cond_13
    invoke-virtual {v0, v7}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-nez v2, :cond_16

    .line 217
    invoke-virtual {v0, v6}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-nez v2, :cond_14

    invoke-virtual {v0, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_16

    .line 138
    :cond_14
    invoke-static {v0}, Ll/ܶᩴۚ;->᩷(Lbin/mt/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 139
    sget-object v0, Ll/᩶᩻ܳ;->֡:Ll/᩶᩻ܳ;

    .line 38
    invoke-static {v0, v3, v9}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 140
    :cond_15
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    const-string v2, "Invalid JSON-RPC response"

    .line 45
    invoke-static {v0, v3, v2}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 31
    :cond_16
    invoke-virtual {v11, v0}, Ll/᩵ᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Ll/ۗᩴۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗᩴۚ;->᩷()Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    .line 123
    :catch_0
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v2, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v3, -0x7fbc

    const-string v4, "Parse error"

    invoke-static {v0, v2, v3, v4}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    return-object v0

    :catch_1
    move-exception v0

    move-object v4, v0

    .line 105
    nop

    instance-of v0, v4, Ll/֡᩻ܳ;

    if-eqz v0, :cond_17

    move-object v0, v4

    check-cast v0, Ll/֡᩻ܳ;

    .line 106
    invoke-virtual {v0}, Ll/֡᩻ܳ;->ۙ()Ll/᩶᩻ܳ;

    move-result-object v0

    sget-object v4, Ll/᩶᩻ܳ;->ۧۙ:Ll/᩶᩻ܳ;

    if-ne v0, v4, :cond_17

    const-string v0, "MCP request body exceeds 8388608 bytes. Use smaller requests or compact JSON."

    .line 45
    invoke-static {v4, v3, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ll/ܿ᩻ܳ;->ۙ()V

    return-object v0

    .line 114
    :cond_17
    sget-object v0, Ll/᩶᩻ܳ;->۟:Ll/᩶᩻ܳ;

    sget-object v3, Lbin/mt/json/JSON;->NULL:Lbin/mt/json/JSONValue;

    const/16 v4, -0x7f58

    invoke-static {v0, v3, v4, v2}, Ll/ᩴܳۚ;->ۙ(Ll/᩶᩻ܳ;Lbin/mt/json/JSONValue;ILjava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 115
    invoke-virtual {v0}, Ll/ܿ᩻ܳ;->ۙ()V

    return-object v0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Z
    .locals 6

    const-string v0, "jsonrpc"

    .line 224
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    const-string v1, "id"

    .line 225
    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    const-string v2, "result"

    .line 226
    invoke-virtual {p0, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    const-string v3, "error"

    .line 227
    invoke-virtual {p0, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 228
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez p0, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    if-eq v2, v5, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    const/4 v2, 0x0

    :goto_3
    if-eqz v0, :cond_8

    .line 231
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v5, "2.0"

    .line 232
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    if-eqz v2, :cond_8

    if-nez p0, :cond_5

    return v4

    .line 257
    :cond_5
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    .line 260
    :cond_6
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "code"

    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 261
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    const-string v1, "message"

    invoke-virtual {p0, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz v0, :cond_8

    .line 262
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v1

    if-eqz v1, :cond_8

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_4

    .line 266
    :cond_7
    :try_start_0
    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->asLong()J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    :catch_0
    :cond_8
    :goto_4
    return v3
.end method

.method public static ᩸(Ll/ۗ᩻ܳ;)Ljava/lang/String;
    .locals 5

    .line 304
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "content-length"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 305
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    const-wide/32 v2, 0x800000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 306
    :cond_0
    new-instance p0, Ll/֡᩻ܳ;

    sget-object v0, Ll/᩶᩻ܳ;->ۧۙ:Ll/᩶᩻ܳ;

    const-string v1, "Request body too large"

    invoke-direct {p0, v0, v1}, Ll/֡᩻ܳ;-><init>(Ll/᩶᩻ܳ;Ljava/lang/String;)V

    throw p0

    .line 308
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->ܽ()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_3

    .line 309
    invoke-virtual {p0}, Ll/ۗ᩻ܳ;->᩸()Ljava/lang/String;

    move-result-object p0

    .line 310
    invoke-static {p0}, Ll/ܶᩴۚ;->ۤ(Ljava/lang/String;)V

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    return-object p0

    .line 313
    :cond_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 314
    invoke-virtual {p0, v0}, Ll/ۗ᩻ܳ;->ۙ(Ljava/util/HashMap;)V

    const-string v2, "postData"

    .line 315
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v0

    .line 319
    :goto_1
    invoke-static {v1}, Ll/ܶᩴۚ;->ۤ(Ljava/lang/String;)V

    .line 320
    invoke-virtual {p0, v1}, Ll/ۗ᩻ܳ;->ۙ(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final ۤ(Ll/ۗ᩻ܳ;)Z
    .locals 5

    .line 368
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object p1

    const-string v0, "origin"

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x1

    if-eqz p1, :cond_4

    .line 369
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    .line 373
    :try_start_0
    iget-object v2, p0, Ll/ܶᩴۚ;->ܶ:Ll/۫ܳۚ;

    invoke-static {p1}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p1

    iget v2, v2, Ll/۫ܳۚ;->ۙ:I

    sget v3, Ll/ۧܳۚ;->᩶:I

    const-string v3, "http"

    .line 104
    invoke-virtual {p1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 105
    invoke-virtual {p1}, Ljava/net/URI;->getPort()I

    move-result v3

    if-ne v3, v2, :cond_3

    .line 106
    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    const-string v2, "127.0.0.1"

    .line 74
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "localhost"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 77
    :cond_1
    invoke-static {}, Ll/۬ۧۤ;->ۙ()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_3

    return v0

    :catch_0
    :cond_3
    return v1

    :cond_4
    :goto_2
    return v0
.end method

.method public ᩷(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;
    .locals 9

    .line 69
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ܺ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ܶᩴۚ;->ܺ:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "text/plain; charset=UTF-8"

    if-nez v0, :cond_0

    .line 70
    sget-object v0, Ll/᩶᩻ܳ;->᩸ۙ:Ll/᩶᩻ܳ;

    const-string v1, "Not Found"

    .line 45
    invoke-static {v0, v2, v1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 70
    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 72
    :cond_0
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->۫()Ll/ۨ᩻ܳ;

    move-result-object v0

    sget-object v3, Ll/ۨ᩻ܳ;->۟:Ll/ۨ᩻ܳ;

    const/4 v4, 0x0

    const-string v5, "POST"

    const-string v6, "Allow"

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    .line 73
    iget-object v1, p0, Ll/ܶᩴۚ;->᩵:Ljava/lang/String;

    aput-object v1, v0, v4

    const v1, 0x7f1205e4

    invoke-static {v1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 277
    sget-object v1, Ll/᩶᩻ܳ;->ۙۙ:Ll/᩶᩻ܳ;

    .line 45
    invoke-static {v1, v2, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 278
    invoke-virtual {v0, v6, v5}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 76
    :cond_1
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->۫()Ll/ۨ᩻ܳ;

    move-result-object v0

    sget-object v3, Ll/ۨ᩻ܳ;->ۜ:Ll/ۨ᩻ܳ;

    if-eq v0, v3, :cond_2

    const-string v0, "Only POST "

    const-string v3, " is supported"

    .line 0
    invoke-static {v0, v1, v3}, Ll/ܰ۟ۙ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 277
    sget-object v1, Ll/᩶᩻ܳ;->ۙۙ:Ll/᩶᩻ܳ;

    .line 45
    invoke-static {v1, v2, v0}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 278
    invoke-virtual {v0, v6, v5}, Ll/ܿ᩻ܳ;->ۙ(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 348
    :cond_2
    invoke-virtual {p1}, Ll/ۗ᩻ܳ;->ᩴ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "accept"

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 349
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 352
    :cond_3
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const-string v3, ","

    .line 353
    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_5

    aget-object v6, v0, v5

    const-string v7, ";"

    const/4 v8, 0x2

    .line 354
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    aget-object v6, v6, v4

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 355
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    .line 356
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    const-string v0, "application/json"

    .line 359
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "application/*"

    .line 360
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "*/*"

    .line 361
    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_1

    .line 80
    :cond_6
    sget-object v0, Ll/᩶᩻ܳ;->ۤۙ:Ll/᩶᩻ܳ;

    const-string v1, "Accept must allow application/json"

    .line 45
    invoke-static {v0, v2, v1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 80
    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 82
    :cond_7
    :goto_1
    invoke-virtual {p0, p1}, Ll/ܶᩴۚ;->ۤ(Ll/ۗ᩻ܳ;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 83
    sget-object v0, Ll/᩶᩻ܳ;->ۡ:Ll/᩶᩻ܳ;

    const-string v1, "Origin is not allowed"

    .line 45
    invoke-static {v0, v2, v1}, Ll/֨᩻ܳ;->ۙ(Ll/ܰ᩻ܳ;Ljava/lang/String;Ljava/lang/String;)Ll/ܿ᩻ܳ;

    move-result-object v0

    .line 83
    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 85
    :cond_8
    iget-object v0, p0, Ll/ܶᩴۚ;->ۗ:Ll/ܽᩴۚ;

    .line 86
    invoke-interface {v0, p1}, Ll/ܽᩴۚ;->ۙ(Ll/ۗ᩻ܳ;)Ll/᩻ᩴۚ;

    move-result-object v0

    .line 87
    invoke-static {v0}, Ll/᩻ᩴۚ;->᩷(Ll/᩻ᩴۚ;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 88
    invoke-static {v0}, Ll/᩻ᩴۚ;->ۙ(Ll/᩻ᩴۚ;)Ll/ܿ᩻ܳ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܶᩴۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/ܿ᩻ܳ;)V

    return-object v0

    .line 92
    :cond_9
    invoke-virtual {p0}, Ll/֨᩻ܳ;->ۙ()I

    move-result v1

    if-lez v1, :cond_a

    invoke-virtual {p0}, Ll/֨᩻ܳ;->ۙ()I

    move-result v1

    goto :goto_2

    :cond_a
    iget v1, p0, Ll/ܶᩴۚ;->᩻:I

    .line 91
    :goto_2
    invoke-static {p1, v0, v1}, Ll/᩸ܳۚ;->ۙ(Ll/ۗ᩻ܳ;Ll/᩻ᩴۚ;I)Ll/᩸ܳۚ;

    move-result-object v0

    .line 94
    :try_start_0
    invoke-direct {p0, p1}, Ll/ܶᩴۚ;->ᩴ(Ll/ۗ᩻ܳ;)Ll/ܿ᩻ܳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-static {v0}, Ll/᩸ܳۚ;->ۙ(Ll/᩸ܳۚ;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, Ll/᩸ܳۚ;->ۙ(Ll/᩸ܳۚ;)V

    .line 97
    throw p1
.end method

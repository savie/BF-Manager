.class public final Ll/ۡ۟ۚ;
.super Ll/ᩳܳۚ;
.source "P6BX"


# instance fields
.field public final ۙ:Ll/ۚᩳۚ;

.field public final ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۚᩳۚ;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ۚᩳۚ;

    .line 26
    iput-object p2, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    return-void
.end method

.method public static ۙ(Ll/ۚᩳۚ;)Ljava/util/List;
    .locals 6

    .line 31
    new-instance v0, Ll/ۡ۟ۚ;

    const-string v1, "mt_file_transfer_create_upload"

    invoke-direct {v0, p0, v1}, Ll/ۡ۟ۚ;-><init>(Ll/ۚᩳۚ;Ljava/lang/String;)V

    new-instance v1, Ll/ۡ۟ۚ;

    const-string v2, "mt_file_transfer_create_download"

    invoke-direct {v1, p0, v2}, Ll/ۡ۟ۚ;-><init>(Ll/ۚᩳۚ;Ljava/lang/String;)V

    new-instance v2, Ll/ۡ۟ۚ;

    const-string v3, "mt_file_transfer_get"

    invoke-direct {v2, p0, v3}, Ll/ۡ۟ۚ;-><init>(Ll/ۚᩳۚ;Ljava/lang/String;)V

    new-instance v3, Ll/ۡ۟ۚ;

    const-string v4, "mt_file_transfer_cancel"

    invoke-direct {v3, p0, v4}, Ll/ۡ۟ۚ;-><init>(Ll/ۚᩳۚ;Ljava/lang/String;)V

    const/4 p0, 0x4

    new-array v4, p0, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v1, 0x2

    aput-object v2, v4, v1

    const/4 v1, 0x3

    aput-object v3, v4, v1

    .line 0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge v5, p0, :cond_0

    aget-object v2, v4, v5

    invoke-static {v2, v1, v2, v5, v0}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;II)I

    move-result v5

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ll/ۙۚۗ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private ۚ()Z
    .locals 2

    const-string v0, "mt_file_transfer_create_upload"

    .line 166
    iget-object v1, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "mt_file_transfer_create_download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public static ۫()Lbin/mt/json/JSONObject;
    .locals 4

    .line 132
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether the upload may have changed the phone file; null when not reported."

    const-string v2, "boolean"

    .line 133
    invoke-static {v2, v1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "changed"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Whether the final phone file state is known; null when not reported."

    .line 134
    invoke-static {v2, v1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "stateKnown"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Warnings about saving the phone file or removing temporary data after failure."

    .line 135
    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "warnings"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Details about changes to the phone file when an operation failed."

    .line 132
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 80
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_transfer_get"

    iget-object v2, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "mt_file_transfer_create_download"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    const-string v3, "readOnlyHint"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "mt_file_transfer_create_upload"

    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "destructiveHint"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 140
    invoke-static {p1}, Ll/ۚᩳۚ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    const-string v1, "mt_file_transfer_create_upload"

    .line 145
    iget-object v2, v0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "transferId"

    const-string v8, "sha256"

    const-string v5, "overwrite"

    const-string v6, "path"

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/String;

    aput-object v6, v3, v10

    aput-object v5, v3, v9

    const/4 v9, 0x2

    const-string v10, "size"

    aput-object v10, v3, v9

    const/4 v9, 0x3

    aput-object v8, v3, v9

    goto :goto_0

    .line 146
    :cond_0
    invoke-direct/range {p0 .. p0}, Ll/ۡ۟ۚ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_1

    new-array v3, v9, [Ljava/lang/String;

    aput-object v6, v3, v10

    goto :goto_0

    :cond_1
    new-array v3, v9, [Ljava/lang/String;

    aput-object v4, v3, v10

    .line 147
    :goto_0
    new-instance v9, Ll/֨۟ۚ;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    const-string v10, "Invalid file transfer argument"

    .line 149
    invoke-static {v7, v9, v10, v3}, Ll/ۢ֡ۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/ᩳ֡ۚ;Ljava/lang/String;[Ljava/lang/String;)V

    .line 151
    invoke-direct/range {p0 .. p0}, Ll/ۡ۟ۚ;->ۚ()Z

    move-result v3

    if-eqz v3, :cond_6

    const-string v3, "Invalid path"

    .line 152
    invoke-static {v7, v6, v3, v9}, Ll/ۢ֡ۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ll/֨۟ۚ;)Ljava/lang/String;

    move-result-object v11

    .line 153
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 51
    invoke-virtual {v7, v5}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 52
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 55
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    const/4 v13, 0x1

    goto :goto_1

    :cond_2
    const-string v2, "Invalid overwrite"

    .line 53
    invoke-virtual {v9, v1, v2, v5}, Ll/֨۟ۚ;->ۙ(Lbin/mt/json/JSONValue;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;

    move-result-object v1

    throw v1

    :cond_3
    const/4 v1, 0x0

    const/4 v13, 0x0

    :goto_1
    if-eqz v12, :cond_4

    const-wide/16 v3, 0x0

    const-wide v5, 0x1fffffffffffffL

    const-string v2, "size"

    move-object/from16 v1, p1

    .line 156
    invoke-static/range {v1 .. v6}, Ll/ۛܰۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;JJ)J

    move-result-wide v1

    goto :goto_2

    :cond_4
    const-wide/16 v1, 0x0

    :goto_2
    move-wide v14, v1

    if-eqz v12, :cond_5

    const-string v1, "Invalid sha256"

    .line 157
    invoke-static {v7, v8, v1, v9}, Ll/ۢ֡ۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ll/֨۟ۚ;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    const-string v1, ""

    :goto_3
    move-object/from16 v16, v1

    .line 154
    iget-object v10, v0, Ll/ۡ۟ۚ;->ۙ:Ll/ۚᩳۚ;

    invoke-virtual/range {v10 .. v16}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;ZZJLjava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    goto :goto_4

    :cond_6
    const-string v1, "Invalid transferId"

    .line 159
    invoke-static {v7, v4, v1, v9}, Ll/ۢ֡ۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ll/֨۟ۚ;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "mt_file_transfer_cancel"

    .line 160
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Ll/ۡ۟ۚ;->ۙ:Ll/ۚᩳۚ;

    if-eqz v2, :cond_7

    invoke-virtual {v3, v1}, Ll/ۚᩳۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    goto :goto_4

    :cond_7
    invoke-virtual {v3, v1}, Ll/ۚᩳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 162
    :goto_4
    new-instance v2, Ll/֨ܳۚ;

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v3

    invoke-static {v1, v3}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-direct {v2, v1}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v2
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 86
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 87
    invoke-direct {p0}, Ll/ۡ۟ۚ;->ۚ()Z

    move-result v1

    const-string v2, "string"

    if-eqz v1, :cond_0

    const-string v1, "Non-empty path on the device running MT, absolute or relative to the current Home. Example: incoming/app.apk."

    .line 96
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "path"

    .line 87
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_0
    const-string v1, "Copy the transferId returned when creating the ticket."

    .line 96
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "transferId"

    .line 89
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :goto_0
    const-string v1, "mt_file_transfer_create_upload"

    .line 90
    iget-object v3, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Use false to refuse an existing destination. true allows replacement when the upload finishes, even if the destination changed after this call."

    const-string v3, "boolean"

    .line 124
    invoke-static {v3, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "overwrite"

    .line 91
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Exact source file length in bytes, 0..9007199254740991. Zero creates an empty file."

    const-string v4, "integer"

    .line 110
    invoke-static {v4, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "size"

    .line 92
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "64 hexadecimal characters for expected content verification, or an empty string to omit the expected digest."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "sha256"

    .line 93
    invoke-virtual {v1, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_1
    const-string v1, "File transfer arguments."

    .line 95
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 3

    .line 41
    iget-object v0, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "mt_file_transfer_create_download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "mt_file_transfer_create_upload"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "mt_file_transfer_cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const-string v0, "Get File Transfer"

    return-object v0

    :pswitch_0
    const-string v0, "Prepare File Download"

    return-object v0

    :pswitch_1
    const-string v0, "Prepare File Upload"

    return-object v0

    :pswitch_2
    const-string v0, "Cancel File Transfer"

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x691d7bdd -> :sswitch_2
        0x3c4740db -> :sswitch_1
        0x3f5cace2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 12

    .line 113
    invoke-static {}, Ll/ۡ۟ۚ;->۫()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Recorded transfer error, or null if none. Independent of the tool call\'s ok; may remain after cancellation. Inspect diagnostics before retrying."

    const-string v2, "description"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "properties"

    .line 115
    invoke-virtual {v0, v1}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "retrySameArguments"

    invoke-virtual {v1, v3}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Advice for retrying the failed transfer operation unchanged, not for repeating mt_file_transfer_get. false does not by itself invalidate the ticket; HTTP retries still require a valid ticket and follow the upload/download retry rules."

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 117
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "string"

    const-string v3, "Opaque transfer identifier."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "transferId"

    .line 118
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "upload"

    const-string v4, "download"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "File direction relative to the device running MT: upload sends to MT; download reads from MT."

    .line 119
    invoke-static {v4, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "direction"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Normalized absolute path on the device running MT."

    .line 96
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "path"

    .line 120
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v10, "cancelled"

    const-string v11, "expired"

    const-string v3, "ready"

    const-string v4, "receiving"

    const-string v5, "sending"

    const-string v6, "publishing"

    const-string v7, "completed"

    const-string v8, "failed"

    const-string v9, "cancelling"

    filled-new-array/range {v3 .. v11}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "Current transfer state. publishing: saving the upload and cannot cancel. completed: upload saved, or download fully sent; does not confirm the receiving device saved it."

    .line 121
    invoke-static {v4, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "state"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "integer"

    const-string v4, "Bytes received or read for sending in the latest PUT/GET; does not confirm the receiving device saved them."

    .line 110
    invoke-static {v3, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "bytesTransferred"

    .line 123
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Length in bytes: required upload size, or file length observed when creating the download ticket or starting the latest GET. HEAD does not update this value."

    .line 110
    invoke-static {v3, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "size"

    .line 124
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "SHA-256 computed from successfully transferred bytes, or empty before success."

    .line 96
    invoke-static {v2, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "sha256"

    .line 125
    invoke-virtual {v1, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "Unix milliseconds when new attempts expire; active attempts are not cut off at this deadline."

    .line 110
    invoke-static {v3, v4}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "expiresAt"

    .line 126
    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Warnings about saving the uploaded file."

    .line 127
    invoke-static {v3}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "warnings"

    invoke-virtual {v1, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "error"

    .line 128
    invoke-static {v0}, Ll/ۤܳۚ;->ۤ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 101
    invoke-direct {p0}, Ll/ۡ۟ۚ;->ۚ()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Direct LAN HTTP URL for this transfer."

    .line 96
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "url"

    .line 102
    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v1, "PUT"

    const-string v3, "GET"

    .line 103
    filled-new-array {v1, v3}, [Ljava/lang/String;

    move-result-object v1

    const-string v3, "HTTP method to transfer the file."

    invoke-static {v3, v1}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "method"

    invoke-virtual {v0, v3, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 105
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Authorization"

    const-string v4, "Temporary transfer credential; do not log or share."

    const-string v5, "Headers required by the HTTP file request."

    .line 0
    invoke-static {v1, v2, v4, v3, v5}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "headers"

    .line 104
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    :cond_0
    const-string v1, "Transfer state."

    .line 108
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-static {}, Ll/ۡ۟ۚ;->۫()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Use the transferId with get or cancel as needed."

    .line 109
    invoke-static {v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "File transfer control result."

    .line 107
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 3

    .line 51
    iget-object v0, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "mt_file_transfer_create_download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "mt_file_transfer_create_upload"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "mt_file_transfer_cancel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const-string v0, "Query a file transfer\'s progress or recorded result, especially after an HTTP timeout. A successful query does not mean the transfer succeeded: inspect data.state and non-null data.error, including its diagnostics before retrying. Results are retained for 10 minutes after a terminal state; service restart invalidates all tickets."

    return-object v0

    :pswitch_0
    const-string v0, "Prepare a file download from the device running MT to an MCP client. Use an HTTP client to GET the returned url with its headers and save the response on the receiving device. This call alone does not save the file on that device. Existing allowed regular files can be downloaded directly. Only content that exists solely in an APK workspace needs to be exported or built to a file first. Each GET reads the current file. Full retries are allowed until expiresAt; no Range resume. HEAD returns metadata without starting a download. After GET, use mt_file_transfer_get to check completion and compare its sha256 with the saved local file."

    return-object v0

    :pswitch_1
    const-string v0, "Prepare a file upload from an MCP client to the device running MT. Use an HTTP client with access to the source file and LAN access to send it as the raw PUT body to the returned url, using its headers and Content-Length equal to size. This call alone does not transfer bytes. The phone destination\'s parent must exist. Start within 10 minutes. After a lost HTTP response, query mt_file_transfer_get before retrying; completed PUTs do not write again. Failed uploads require a new ticket; inspect the recorded error first because the destination may have changed. No chunked uploads or resume."

    return-object v0

    :pswitch_2
    const-string v0, "Cancel a file transfer or invalidate a reusable download ticket. Cancellation does not undo changes to the phone file. If the state is publishing, cancellation is no longer possible and the current state is returned. While cancelling, poll mt_file_transfer_get until the state changes. Even when cancelled, inspect non-null data.error.diagnostics before retrying; earlier failures may have changed the destination."

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x691d7bdd -> :sswitch_2
        0x3c4740db -> :sswitch_1
        0x3f5cace2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۡ۟ۚ;->᩷:Ljava/lang/String;

    return-object v0
.end method

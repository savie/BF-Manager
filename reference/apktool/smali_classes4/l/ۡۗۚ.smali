.class public abstract Ll/ۡۗۚ;
.super Ll/ᩳܳۚ;
.source "RIRR"


# instance fields
.field public ۙ:Lbin/mt/json/JSONObject;

.field public final ۤ:Ll/֫ۨۚ;

.field public ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/֫ۨۚ;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 28
    iput-object p1, p0, Ll/ۡۗۚ;->ۤ:Ll/֫ۨۚ;

    return-void
.end method

.method public static ۙ(Ll/ۡۗۚ;Ll/ᩳۨۚ;I)Ll/֨ܳۚ;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 98
    iget-object v2, v0, Ll/ۡۗۚ;->ۤ:Ll/֫ۨۚ;

    new-instance v3, Ll/ۘ۫ۚ;

    .line 15
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-virtual {v2, v1, v3}, Ll/֫ۨۚ;->ۙ(Ll/ᩳۨۚ;Ll/ۘ۫ۚ;)Ll/ۘۛۚ;

    move-result-object v2

    .line 99
    sget v3, Ll/᩺۫ۚ;->ۙ:I

    .line 100
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    iget-object v4, v2, Ll/ۘۛۚ;->ۨ:Ljava/lang/String;

    const-string v5, "workspaceId"

    invoke-virtual {v3, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v5, "editSessionId"

    iget-object v6, v1, Ll/ᩳۨۚ;->᩷:Ljava/lang/String;

    .line 101
    invoke-virtual {v3, v5, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 102
    invoke-virtual {v0, v3, v2}, Ll/ۡۗۚ;->ۙ(Lbin/mt/json/JSONObject;Ll/ۘۛۚ;)V

    .line 103
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v5

    .line 115
    iget-boolean v6, v2, Ll/ۘۛۚ;->ۗ:Z

    const/16 v7, 0x3e8

    const-string v8, "limitMax"

    if-eqz v6, :cond_0

    .line 116
    invoke-virtual/range {p0 .. p1}, Ll/ۡۗۚ;->ۙ(Ll/ᩳۨۚ;)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v10, "recommendedLimit"

    iget v11, v1, Ll/ᩳۨۚ;->ۤ:I

    invoke-virtual {v9, v10, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 117
    invoke-virtual {v9, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v14

    .line 118
    invoke-virtual/range {p0 .. p0}, Ll/ۡۗۚ;->֫()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v2, Ll/ۘۛۚ;->ۨ:Ljava/lang/String;

    iget-object v12, v1, Ll/ᩳۨۚ;->᩷:Ljava/lang/String;

    .line 119
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v9, "offset"

    iget v13, v2, Ll/ۘۛۚ;->᩻:I

    invoke-virtual {v0, v9, v13}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v15

    move/from16 v13, p2

    .line 118
    invoke-static/range {v10 .. v15}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    .line 120
    iget-object v1, v1, Ll/ᩳۨۚ;->᩷:Ljava/lang/String;

    iget v9, v2, Ll/ۘۛۚ;->ۚ:I

    .line 122
    invoke-static {v4, v9, v1, v0}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "mt_apk_continue"

    const-string v9, "continue"

    const-string v10, "Continue listing next page"

    .line 120
    invoke-static {v1, v4, v9, v10}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v5, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 125
    :goto_0
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "hasMore"

    invoke-virtual {v1, v4, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "nextCursor"

    invoke-virtual {v1, v4, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "returnedCount"

    iget v4, v2, Ll/ۘۛۚ;->ۤ:I

    .line 126
    invoke-virtual {v0, v1, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0, v8, v7}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "totalAvailableCount"

    iget v2, v2, Ll/ۘۛۚ;->᩹:I

    .line 127
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "pagination"

    .line 104
    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    .line 105
    new-instance v0, Ll/֨ܳۚ;

    invoke-static {v3, v5}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 40
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

    .line 200
    invoke-static {p1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۙ(Ll/ᩳۨۚ;)Lbin/mt/json/JSONObject;
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 4

    .line 73
    :try_start_0
    invoke-virtual {p0, p1}, Ll/ۡۗۚ;->᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;

    move-result-object p1

    iget-object v0, p1, Ll/ᩳۨۚ;->᩻:Ljava/lang/String;

    .line 95
    iget-object v1, p0, Ll/ۡۗۚ;->ۤ:Ll/֫ۨۚ;

    iget-object v2, p1, Ll/ᩳۨۚ;->᩷:Ljava/lang/String;

    new-instance v3, Ll/֨ۗۚ;

    invoke-direct {v3, p0, p1}, Ll/֨ۗۚ;-><init>(Ll/ۡۗۚ;Ll/ᩳۨۚ;)V

    const/4 p1, 0x0

    invoke-virtual {v1, v0, v2, p1, v3}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨۚ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܳۚ;

    .line 107
    invoke-virtual {v1, v0}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 76
    throw p1
.end method

.method public final ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 82
    invoke-virtual/range {p0 .. p0}, Ll/ۡۗۚ;->֫()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Ll/ܰ۫ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 83
    invoke-static/range {p1 .. p2}, Ll/ۘ᩵ۚ;->᩷(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Ll/ۡۗۚ;->᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;

    move-result-object v4

    .line 85
    new-instance v15, Ll/ᩳۨۚ;

    iget-object v14, v4, Ll/ᩳۨۚ;->᩻:Ljava/lang/String;

    iget-object v13, v4, Ll/ᩳۨۚ;->᩷:Ljava/lang/String;

    iget-object v8, v4, Ll/ᩳۨۚ;->ۧ:Ljava/lang/String;

    iget-object v9, v4, Ll/ᩳۨۚ;->۫:Ljava/lang/String;

    iget v11, v4, Ll/ᩳۨۚ;->ۤ:I

    iget-object v1, v1, Ll/ܰ۫ۚ;->ۤ:Lbin/mt/json/JSONObject;

    const-string v5, "offset"

    .line 86
    invoke-virtual {v1, v5}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    iget v1, v4, Ll/ᩳۨۚ;->᩸:I

    iget-object v10, v4, Ll/ᩳۨۚ;->ۚ:Ljava/lang/String;

    iget-object v4, v4, Ll/ᩳۨۚ;->֫:Ljava/lang/String;

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v5, v15

    move-object v6, v14

    move-object v7, v13

    move-object/from16 v18, v10

    move-object/from16 v10, v16

    move-object/from16 v19, v13

    move/from16 v13, v17

    move-object/from16 v20, v14

    move v14, v1

    move-object v1, v15

    move-object/from16 v15, v18

    move-object/from16 v16, v4

    invoke-direct/range {v5 .. v16}, Ll/ᩳۨۚ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;)V

    .line 88
    invoke-virtual/range {p0 .. p0}, Ll/ᩳܳۚ;->᩸()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ll/ۤۤۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v2, "nextCursor"

    move-object/from16 v4, p2

    .line 89
    invoke-virtual {v4, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 95
    new-instance v3, Ll/֨ۗۚ;

    invoke-direct {v3, v0, v1}, Ll/֨ۗۚ;-><init>(Ll/ۡۗۚ;Ll/ᩳۨۚ;)V

    iget-object v1, v0, Ll/ۡۗۚ;->ۤ:Ll/֫ۨۚ;

    move-object/from16 v5, v19

    move-object/from16 v4, v20

    invoke-virtual {v1, v4, v5, v2, v3}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨۚ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ܳۚ;

    .line 107
    invoke-virtual {v1, v4}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;)V

    return-object v2

    :cond_0
    const-string v1, "Mismatched list cursor type"

    .line 48
    invoke-static {v1, v3, v3, v3, v3}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object v1

    .line 82
    throw v1
.end method

.method public abstract ۙ(Lbin/mt/json/JSONObject;Ll/ۘۛۚ;)V
.end method

.method public abstract ۚ()Lbin/mt/json/JSONObject;
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۡۗۚ;->ۙ:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۡۗۚ;->۫()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۗۚ;->ۙ:Lbin/mt/json/JSONObject;

    .line 46
    :cond_0
    iget-object v0, p0, Ll/ۡۗۚ;->ۙ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public abstract ۫()Lbin/mt/json/JSONObject;
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 51
    iget-object v0, p0, Ll/ۡۗۚ;->᩷:Lbin/mt/json/JSONObject;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ll/ۡۗۚ;->ۚ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۡۗۚ;->᩷:Lbin/mt/json/JSONObject;

    .line 52
    :cond_0
    iget-object v0, p0, Ll/ۡۗۚ;->᩷:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public abstract ᩷(Lbin/mt/json/JSONObject;)Ll/ᩳۨۚ;
.end method

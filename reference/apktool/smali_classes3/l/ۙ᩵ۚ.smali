.class public final Ll/ۙ᩵ۚ;
.super Ll/ᩳܳۚ;
.source "1IVB"


# instance fields
.field public ۙ:Ljava/lang/String;

.field public final ۤ:Ll/֫ۨۚ;

.field public ᩷:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/֫ۨۚ;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ۙ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    return-void
.end method

.method public static synthetic ۙ(Ll/ۙ᩵ۚ;Ll/ۖۨۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ll/֨ܳۚ;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "startColumn"

    .line 158
    iget-object v5, v1, Ll/ۖۨۚ;->᩻:Ll/۬ۨۚ;

    iget v6, v1, Ll/ۖۨۚ;->ۧ:I

    iget v7, v1, Ll/ۖۨۚ;->᩸:I

    iget v8, v1, Ll/ۖۨۚ;->۫:I

    invoke-static {v5}, Ll/ۘ᩵ۚ;->ۙ(Ll/۬ۨۚ;)Ljava/lang/String;

    move-result-object v5

    .line 159
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v9

    iget-object v10, v1, Ll/ۖۨۚ;->ܺ:Ljava/lang/String;

    invoke-virtual {v9, v10}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    iget-object v11, v1, Ll/ۖۨۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v9, v11}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    move/from16 v15, p5

    .line 160
    invoke-virtual {v9, v15}, Lbin/mt/json/JSONArray;->add(I)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-virtual {v9, v5}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-virtual {v9, v2}, Lbin/mt/json/JSONArray;->add(Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v9

    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v9

    .line 162
    iget-object v12, v0, Ll/ۙ᩵ۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    .line 163
    iget-object v0, v0, Ll/ۙ᩵ۚ;->᩷:Ljava/lang/String;

    goto :goto_0

    .line 165
    :cond_0
    iput-object v13, v0, Ll/ۙ᩵ۚ;->ۙ:Ljava/lang/String;

    .line 166
    iput-object v13, v0, Ll/ۙ᩵ۚ;->᩷:Ljava/lang/String;

    .line 167
    iget-object v12, v0, Ll/ۙ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-virtual {v12, v1, v2}, Ll/֫ۨۚ;->ۙ(Ll/ۖۨۚ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 168
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v13

    const/high16 v14, 0x200000

    if-gt v13, v14, :cond_1

    .line 169
    iput-object v12, v0, Ll/ۙ᩵ۚ;->᩷:Ljava/lang/String;

    .line 170
    iput-object v9, v0, Ll/ۙ᩵ۚ;->ۙ:Ljava/lang/String;

    :cond_1
    move-object v0, v12

    .line 173
    :goto_0
    invoke-static {v0}, Ll/ܿۧۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v14, "nextCursor"

    const-string v13, "startLine"

    const/4 v12, 0x0

    if-eqz v3, :cond_3

    .line 174
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 176
    :cond_2
    invoke-static/range {p4 .. p4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Pseudocode changed; read the target again"

    .line 175
    invoke-static {v3, v14, v0, v1, v2}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0

    .line 180
    :cond_3
    :goto_1
    :try_start_0
    iget v3, v1, Ll/ۖۨۚ;->ۚ:I

    invoke-static {v0, v3, v7, v8, v6}, Ll/֨۫ۚ;->ۙ(Ljava/lang/String;IIII)Ll/ۢ۫ۚ;

    move-result-object v0
    :try_end_0
    .catch Ll/ۢܳۚ; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v0, Ll/ۢ۫ۚ;->᩻:Ljava/lang/String;

    iget-boolean v7, v0, Ll/ۢ۫ۚ;->ۙ:Z

    .line 188
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v12

    move-object/from16 p0, v3

    const-string v3, "maxChars"

    move-object/from16 v18, v4

    const-string v4, "style"

    if-eqz v7, :cond_4

    move-object/from16 p3, v12

    const-string v12, "target"

    .line 0
    invoke-static {v12, v5, v4, v2}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    move-object/from16 v16, v13

    const-string v13, "textHash"

    .line 192
    invoke-virtual {v12, v13, v9}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9, v3, v6}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "recommendedLimit"

    .line 193
    invoke-virtual {v6, v9, v8}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v9, "limitMax"

    const/16 v12, 0x7d0

    invoke-virtual {v6, v9, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    .line 194
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v12, v0, Ll/ۢ۫ۚ;->֫:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const-string v13, "lineOffset"

    invoke-virtual {v9, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    iget-object v12, v0, Ll/ۢ۫ۚ;->ۚ:Ljava/lang/Integer;

    .line 195
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    const-string v13, "lineCharOffset"

    invoke-virtual {v9, v13, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v17

    .line 196
    iget-object v13, v1, Ll/ۖۨۚ;->ܺ:Ljava/lang/String;

    iget-object v1, v1, Ll/ۖۨۚ;->ۙ:Ljava/lang/String;

    const-string v12, "java_pseudocode"

    move-object/from16 v9, p3

    move/from16 p3, v7

    move-object/from16 v7, v16

    move-object/from16 v19, v14

    move-object v14, v1

    move/from16 v15, p5

    move-object/from16 v16, v6

    invoke-static/range {v12 .. v17}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "Continue Java pseudocode"

    .line 200
    invoke-static {v10, v8, v11, v1}, Ll/ۘ᩵ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v8

    const-string v12, "mt_apk_continue"

    const-string v13, "continue"

    .line 198
    invoke-static {v8, v12, v13, v6}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {v9, v6}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    goto :goto_2

    :cond_4
    move/from16 p3, v7

    move-object v9, v12

    move-object v7, v13

    move-object/from16 v19, v14

    const/4 v1, 0x0

    :goto_2
    const-string v6, "workspaceId"

    const-string v8, "editSessionId"

    .line 0
    invoke-static {v6, v10, v8, v11}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "locator"

    .line 206
    invoke-virtual {v12, v13, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v14, "limit"

    const/16 v15, 0x1f4

    invoke-virtual {v12, v14, v15}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    const v14, 0xc000

    invoke-virtual {v12, v3, v14}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v12, 0x0

    .line 207
    invoke-virtual {v3, v7, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    move-object/from16 v14, v18

    invoke-virtual {v3, v14, v12}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v12, "mt_apk_read_text"

    const-string v15, "inspect"

    move-object/from16 v16, v1

    const-string v1, "Optional: read Smali for verification or editing"

    .line 203
    invoke-static {v3, v12, v15, v1}, Ll/ۖܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v9, v1}, Lbin/mt/json/JSONArray;->add(Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONArray;

    .line 208
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v6, v10}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 209
    invoke-virtual {v1, v8, v11}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v13, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 210
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "text"

    move-object/from16 v4, p0

    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget v3, v0, Ll/ۢ۫ۚ;->ܳ:I

    .line 211
    invoke-virtual {v2, v7, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    iget v3, v0, Ll/ۢ۫ۚ;->᩷:I

    invoke-virtual {v2, v14, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextLine"

    iget v5, v0, Ll/ۢ۫ۚ;->ᩴ:I

    .line 212
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "nextColumn"

    iget v5, v0, Ll/ۢ۫ۚ;->᩸:I

    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "returnedLineCount"

    iget v5, v0, Ll/ۢ۫ۚ;->ۤ:I

    .line 213
    invoke-virtual {v2, v3, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    .line 214
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v3}, Ljava/lang/String;->codePointCount(II)I

    move-result v3

    const-string v4, "returnedCodePoints"

    invoke-virtual {v2, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "totalLineCount"

    iget v4, v0, Ll/ۢ۫ۚ;->ۧ:I

    .line 215
    invoke-virtual {v2, v3, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "lineTruncated"

    iget-boolean v0, v0, Ll/ۢ۫ۚ;->۫:Z

    invoke-virtual {v2, v3, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "textWindow"

    .line 210
    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 216
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "hasMore"

    move/from16 v3, p3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v1

    move-object/from16 v3, v16

    move-object/from16 v2, v19

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 217
    new-instance v1, Ll/֨ܳۚ;

    invoke-static {v0, v9}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-direct {v1, v0}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v1

    :catch_0
    move v0, v7

    move-object v7, v13

    move-object v2, v14

    move-object v14, v4

    if-nez p4, :cond_5

    move-object v2, v14

    :cond_5
    if-nez p4, :cond_6

    .line 185
    invoke-static {v0}, Lbin/mt/json/JSON;->value(I)Lbin/mt/json/JSONValue;

    move-result-object v0

    goto :goto_3

    :cond_6
    invoke-static/range {p4 .. p4}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    .line 186
    :goto_3
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v7, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v14, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "Invalid pseudocode read position"

    .line 183
    invoke-static {v4, v2, v0, v1, v3}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object v0

    throw v0
.end method

.method public static ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 5

    const-string v0, "style"

    .line 135
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string v1, "instruction"

    const-string v2, "readable"

    if-eqz p0, :cond_1

    .line 136
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 137
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    :cond_0
    return-object v3

    .line 140
    :cond_1
    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    .line 141
    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Invalid Java pseudocode style"

    .line 140
    invoke-static {v3, v0, p0, v1, v2}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0
.end method

.method public static ᩷(Lbin/mt/json/JSONObject;)Ll/ۖۨۚ;
    .locals 4

    .line 145
    invoke-static {p0}, Ll/ۘ᩵ۚ;->ۘ(Lbin/mt/json/JSONObject;)Ll/ۖۨۚ;

    move-result-object v0

    .line 146
    iget-object v1, v0, Ll/ۖۨۚ;->᩻:Ll/۬ۨۚ;

    iget-object v1, v1, Ll/۬ۨۚ;->᩸:Ljava/lang/String;

    const-string v2, "dex_class_smali"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "dex_method_smali"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "locator"

    .line 148
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const-string v1, "dex_class"

    const-string v2, "dex_method"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 149
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "dex_class:Lcom/example/Foo;"

    invoke-virtual {v2, v0, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "Java pseudocode requires a class or method locator"

    .line 147
    invoke-static {v3, v0, p0, v1, v2}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 107
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    iget-object v1, p1, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 9

    .line 112
    invoke-static {p1}, Ll/ۙ᩵ۚ;->ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    .line 113
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0, p1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string p1, "style"

    .line 114
    invoke-virtual {v0, p1}, Lbin/mt/json/JSONObject;->remove(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    .line 115
    invoke-static {v0}, Ll/ۙ᩵ۚ;->᩷(Lbin/mt/json/JSONObject;)Ll/ۖۨۚ;

    move-result-object v2

    .line 157
    iget-object p1, v2, Ll/ۖۨۚ;->ܺ:Ljava/lang/String;

    iget-object v6, v2, Ll/ۖۨۚ;->ۙ:Ljava/lang/String;

    new-instance v7, Ll/۬ۗۚ;

    const/4 v8, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v4, v8

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Ll/۬ۗۚ;-><init>(Ll/ۙ᩵ۚ;Ll/ۖۨۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۙ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-virtual {v0, p1, v6, v8, v7}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨۚ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܳۚ;

    return-object p1
.end method

.method public final ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 10

    .line 121
    iget-object v0, p1, Ll/ܰ۫ۚ;->᩷:Lbin/mt/json/JSONObject;

    .line 122
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "workspaceId"

    const/4 v3, 0x0

    .line 123
    invoke-virtual {p2, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, ""

    const-string v4, "editSessionId"

    .line 124
    invoke-virtual {p2, v4, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "target"

    .line 125
    invoke-virtual {v0, v2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "locator"

    invoke-virtual {v1, v4, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "limit"

    .line 126
    invoke-virtual {p2, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "maxChars"

    const/4 v4, -0x1

    .line 127
    invoke-virtual {v0, v2, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v1, v2, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    iget-object p1, p1, Ll/ܰ۫ۚ;->ۤ:Lbin/mt/json/JSONObject;

    const-string v2, "lineOffset"

    .line 128
    invoke-virtual {p1, v2, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v2

    const-string v5, "startLine"

    invoke-virtual {v1, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "lineCharOffset"

    .line 129
    invoke-virtual {p1, v2, v4}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    const-string v2, "startColumn"

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 130
    invoke-static {p1}, Ll/ۙ᩵ۚ;->᩷(Lbin/mt/json/JSONObject;)Ll/ۖۨۚ;

    move-result-object v6

    invoke-static {v0}, Ll/ۙ᩵ۚ;->ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string p1, "nextCursor"

    .line 131
    invoke-virtual {p2, p1, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "textHash"

    invoke-virtual {v0, p2, v3}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 157
    iget-object p2, v6, Ll/ۖۨۚ;->ܺ:Ljava/lang/String;

    iget-object v0, v6, Ll/ۖۨۚ;->ۙ:Ljava/lang/String;

    new-instance v1, Ll/۬ۗۚ;

    move-object v4, v1

    move-object v5, p0

    move-object v9, p1

    invoke-direct/range {v4 .. v9}, Ll/۬ۗۚ;-><init>(Ll/ۙ᩵ۚ;Ll/ۖۨۚ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Ll/ۙ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-virtual {v2, p2, v0, p1, v1}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/۫ۨۚ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ܳۚ;

    return-object p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 4

    .line 58
    new-instance v0, Lbin/mt/json/JSONObject;

    new-instance v1, Ll/᩸᩵ۚ;

    new-instance v2, Ll/ᩴ᩵ۚ;

    iget-object v3, p0, Ll/ۙ᩵ۚ;->ۤ:Ll/֫ۨۚ;

    invoke-direct {v2, v3}, Ll/ᩴ᩵ۚ;-><init>(Ll/֫ۨۚ;)V

    invoke-direct {v1, v2}, Ll/᩸᩵ۚ;-><init>(Ll/ᩴ᩵ۚ;)V

    .line 59
    invoke-virtual {v1}, Ll/᩸᩵ۚ;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "properties"

    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lbin/mt/json/JSONObject;-><init>(Lbin/mt/json/JSONObject;)V

    const-string v1, "Exact dex_class or dex_method locator copied from list, search or class outline. Other locator kinds are rejected."

    const-string v2, "string"

    .line 96
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "locator"

    .line 60
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v1, "integer"

    const-string v2, "0-based first line within the returned pseudocode target. Pass 0 for the first page."

    .line 110
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "startLine"

    .line 61
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v2, "0-based Unicode code point column within startLine. Pass 0 for the first page."

    .line 110
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "startColumn"

    .line 62
    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->put(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const-string v1, "readable"

    const-string v2, "instruction"

    .line 63
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "Pass readable for compact expressions or instruction for explicit low-level control flow."

    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "style"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    const/4 v1, 0x0

    .line 64
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read Java Pseudocode"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 10

    .line 69
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "LF-normalized Java pseudocode. DEX identifiers retain their original spelling, even when invalid in Java."

    .line 96
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "text"

    .line 70
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "integer"

    const-string v3, "0-based line component of the inclusive start position."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "startLine"

    .line 71
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "0-based Unicode code point column of the inclusive start position."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "startColumn"

    .line 72
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "0-based line component of the exclusive end position, paired with nextColumn. May remain on startLine; also valid at EOF. Continue via nextActions."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "nextLine"

    .line 73
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "0-based Unicode code point column of the exclusive end position, paired with nextLine, including at EOF."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "nextColumn"

    .line 74
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Number of distinct logical lines touched by returned text."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "returnedLineCount"

    .line 75
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Number of Unicode code points in text, including LF."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "returnedCodePoints"

    .line 76
    invoke-virtual {v0, v4, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Total logical pseudocode lines; an empty target counts as one line, a final LF adds no empty line."

    .line 110
    invoke-static {v2, v3}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "totalLineCount"

    .line 77
    invoke-virtual {v0, v3, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v2, "boolean"

    const-string v3, "Whether the last returned line was cut before its end by the character budget. False when the budget ends exactly at the line end, even if its LF remains unread."

    const-string v4, "lineTruncated"

    const-string v5, "Window within this pseudocode target, not Smali or original-source coordinates."

    .line 0
    invoke-static {v0, v2, v3, v4, v5}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "continue"

    .line 82
    invoke-static {}, Ll/ܶܿ֫;->ۙ()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "mt_apk_continue"

    .line 81
    invoke-static {v4, v5, v3}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, "inspect"

    .line 84
    invoke-static {}, Ll/ܶܿ֫;->᩻()Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "mt_apk_read_text"

    .line 83
    invoke-static {v5, v6, v4}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "retry"

    .line 86
    invoke-static {}, Ll/ܶܿ֫;->۫()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "mt_apk_workspace_open"

    .line 85
    invoke-static {v6, v7, v5}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 88
    invoke-static {}, Ll/ܶܿ֫;->ۤ()Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "mt_apk_dex_list_classes"

    const-string v8, "verify_workspace"

    .line 87
    invoke-static {v6, v7, v8}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "mt_apk_dex_read_class_outline"

    .line 90
    invoke-static {}, Ll/ܶܿ֫;->ۚ()Lbin/mt/json/JSONObject;

    move-result-object v9

    .line 89
    invoke-static {v9, v7, v8}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v7

    const/4 v8, 0x5

    new-array v8, v8, [Lbin/mt/json/JSONObject;

    const/4 v9, 0x0

    aput-object v3, v8, v9

    const/4 v3, 0x1

    aput-object v4, v8, v3

    const/4 v3, 0x2

    aput-object v5, v8, v3

    const/4 v3, 0x3

    aput-object v6, v8, v3

    const/4 v3, 0x4

    aput-object v7, v8, v3

    const-string v3, "Executable calls to continue, inspect Smali, or recover the workspace."

    .line 80
    invoke-static {v3, v8}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v3

    .line 91
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Workspace id."

    .line 96
    invoke-static {v1, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "workspaceId"

    .line 92
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Selected edit session; empty means base workspace."

    .line 96
    invoke-static {v1, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "editSessionId"

    .line 93
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Original target locator, reusable for Smali reads."

    .line 96
    invoke-static {v1, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "locator"

    .line 94
    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "readable"

    const-string v6, "instruction"

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "Requested output style; readable may contain instruction-form methods with error comments."

    .line 95
    invoke-static {v6, v5}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    const-string v6, "style"

    invoke-virtual {v4, v6, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "textWindow"

    .line 96
    invoke-virtual {v4, v5, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 97
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v4

    const-string v5, "Whether more pseudocode remains."

    .line 124
    invoke-static {v2, v5}, Ll/ۤܳۚ;->ۤ(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v5, "hasMore"

    .line 98
    invoke-virtual {v4, v5, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "Opaque continuation cursor, or null at the end."

    .line 103
    invoke-static {v1, v4}, Ll/ۤܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v4, "nextCursor"

    .line 99
    invoke-virtual {v2, v4, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Read continuation."

    .line 97
    invoke-static {v1, v2}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "pagination"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Java pseudocode for the selected target."

    .line 91
    invoke-static {v0, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "No additional pseudocode-specific diagnostics."

    .line 101
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "Java pseudocode for analysis; no editable targetVersion is provided."

    .line 100
    invoke-static {v2, v0, v1, v3}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "For DEX class or method logic, prefer this tool first. Read Java pseudocode for one exact dex_class or dex_method locator. Start with style=readable; use instruction for explicit low-level control flow. If a page is truncated, continue via nextActions. Use mt_apk_read_text for Smali only when exact instructions or editing are needed, generation fails, or questions remain after reading the relevant pseudocode pages. Analysis is limited to the selected class or method, so inferred types may be incomplete. Failed readable methods use instruction form with an error comment. Pseudocode is read-only."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_dex_read_pseudocode"

    return-object v0
.end method

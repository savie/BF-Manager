.class public final Ll/ܶۗۚ;
.super Ll/ᩳܳۚ;
.source "J79X"


# instance fields
.field public final ֫:Ll/ᩴ᩵ۚ;

.field public final ۙ:Ll/᩻ۗۚ;

.field public final ۚ:Ll/ۙ᩵ۚ;

.field public final ۤ:Ll/ܿۗۚ;

.field public final ۧ:Ll/ۚ᩵ۚ;

.field public final ۫:Ll/ۢۗۚ;

.field public final ܳ:Ll/ۜܺۚ;

.field public final ܶ:Ll/۟᩵ۚ;

.field public final ܺ:Ll/ܺ᩵ۚ;

.field public final ܽ:Ll/֫ۨۚ;

.field public final ᩴ:Ll/ۛܺۚ;

.field public final ᩷:Ll/ۗۗۚ;

.field public ᩸:Lbin/mt/json/JSONObject;

.field public final ᩻:Ll/֫᩵ۚ;


# direct methods
.method public constructor <init>(Ll/֫ۨۚ;Ll/ܿۗۚ;Ll/ۗۗۚ;Ll/ۚ᩵ۚ;Ll/ۢۗۚ;Ll/ᩴ᩵ۚ;Ll/ܺ᩵ۚ;Ll/۟᩵ۚ;Ll/֫᩵ۚ;Ll/᩻ۗۚ;Ll/ۛܺۚ;Ll/ۜܺۚ;Ll/ۙ᩵ۚ;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ܶۗۚ;->ܽ:Ll/֫ۨۚ;

    .line 56
    iput-object p2, p0, Ll/ܶۗۚ;->ۤ:Ll/ܿۗۚ;

    .line 57
    iput-object p3, p0, Ll/ܶۗۚ;->᩷:Ll/ۗۗۚ;

    .line 58
    iput-object p4, p0, Ll/ܶۗۚ;->ۧ:Ll/ۚ᩵ۚ;

    .line 59
    iput-object p5, p0, Ll/ܶۗۚ;->۫:Ll/ۢۗۚ;

    .line 60
    iput-object p6, p0, Ll/ܶۗۚ;->֫:Ll/ᩴ᩵ۚ;

    .line 61
    iput-object p13, p0, Ll/ܶۗۚ;->ۚ:Ll/ۙ᩵ۚ;

    .line 62
    iput-object p7, p0, Ll/ܶۗۚ;->ܺ:Ll/ܺ᩵ۚ;

    .line 63
    iput-object p8, p0, Ll/ܶۗۚ;->ܶ:Ll/۟᩵ۚ;

    .line 64
    iput-object p9, p0, Ll/ܶۗۚ;->᩻:Ll/֫᩵ۚ;

    .line 65
    iput-object p10, p0, Ll/ܶۗۚ;->ۙ:Ll/᩻ۗۚ;

    .line 66
    iput-object p11, p0, Ll/ܶۗۚ;->ᩴ:Ll/ۛܺۚ;

    .line 67
    iput-object p12, p0, Ll/ܶۗۚ;->ܳ:Ll/ۜܺۚ;

    return-void
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 90
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

    .line 131
    invoke-static {p1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 9

    const-string v0, "available_apks"

    const-string v1, "installed_apps"

    .line 145
    :try_start_0
    invoke-static {p1}, Ll/ۘ᩵ۚ;->ᩴ(Lbin/mt/json/JSONObject;)Ll/᩹᩵ۚ;

    move-result-object v2

    iget-object v3, v2, Ll/᩹᩵ۚ;->᩷:Ljava/lang/String;

    iget-object v4, v2, Ll/᩹᩵ۚ;->ۙ:Ljava/lang/String;

    iget-object v2, v2, Ll/᩹᩵ۚ;->ۤ:Ljava/lang/String;

    .line 146
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x0

    const-string v7, "Invalid cursor"

    const-string v8, "nextCursor"

    if-eqz v5, :cond_1

    :try_start_1
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1473
    invoke-static {v3, v6, v2, v4}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ܰ۫ۚ;

    move-result-object v0

    .line 148
    iget-object v2, v0, Ll/ܰ۫ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 152
    new-instance v1, Ll/᩶ۗۚ;

    .line 19
    invoke-direct {v1}, Ll/ᩳܳۚ;-><init>()V

    .line 152
    invoke-virtual {v1, v0, p1}, Ll/᩶ۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    .line 149
    :cond_0
    :try_start_2
    invoke-virtual {p1, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    .line 150
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 149
    invoke-static {v7, v8, p1, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 154
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v5, "<cursor>"

    if-eqz v1, :cond_3

    :try_start_3
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1473
    invoke-static {v3, v6, v2, v4}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ܰ۫ۚ;

    move-result-object v1

    .line 156
    iget-object v2, v1, Ll/ܰ۫ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 157
    iget-object v0, p0, Ll/ܶۗۚ;->ۙ:Ll/᩻ۗۚ;

    invoke-virtual {v0, v1, p1}, Ll/᩻ۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    .line 160
    :cond_2
    :try_start_4
    invoke-virtual {p1, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 159
    invoke-static {v7, v8, p1, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1

    .line 163
    :cond_3
    iget-object v0, p0, Ll/ܶۗۚ;->ܽ:Ll/֫ۨۚ;

    invoke-virtual {v0, v2, v4}, Ll/֫ۨۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1473
    :try_start_5
    invoke-static {v3, v0, v2, v4}, Ll/ܿ۫ۚ;->ۙ(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ll/ܰ۫ۚ;

    move-result-object v0

    const-string v1, "list_entries"

    .line 166
    iget-object v2, v0, Ll/ܰ۫ۚ;->ᩴ:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 167
    iget-object v1, p0, Ll/ܶۗۚ;->ۤ:Ll/ܿۗۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۡۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_5
    .catch Ll/ۢܳۚ; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_4
    :try_start_6
    const-string v1, "dex_list_classes"

    .line 168
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 169
    iget-object v1, p0, Ll/ܶۗۚ;->᩷:Ll/ۗۗۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۡۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_6
    .catch Ll/ۢܳۚ; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_5
    :try_start_7
    const-string v1, "resource_list"

    .line 170
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 171
    iget-object v1, p0, Ll/ܶۗۚ;->ۧ:Ll/ۚ᩵ۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۡۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_7
    .catch Ll/ۢܳۚ; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_6
    :try_start_8
    const-string v1, "outline_class"

    .line 172
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 173
    iget-object v1, p0, Ll/ܶۗۚ;->۫:Ll/ۢۗۚ;

    new-instance v2, Ll/ۘ۫ۚ;

    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 173
    invoke-virtual {v1, v0, p1, v2}, Ll/ۢۗۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;Ll/ۘ۫ۚ;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_8
    .catch Ll/ۢܳۚ; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_7
    :try_start_9
    const-string v1, "java_pseudocode"

    .line 174
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 175
    iget-object v1, p0, Ll/ܶۗۚ;->ۚ:Ll/ۙ᩵ۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۙ᩵ۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_9
    .catch Ll/ۢܳۚ; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_8
    :try_start_a
    const-string v1, "read"

    .line 176
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 177
    iget-object v1, p0, Ll/ܶۗۚ;->֫:Ll/ᩴ᩵ۚ;

    new-instance v2, Ll/ۘ۫ۚ;

    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 177
    invoke-virtual {v1, v0, p1, v2}, Ll/ᩴ᩵ۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;Ll/ۘ۫ۚ;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_a
    .catch Ll/ۢܳۚ; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_9
    :try_start_b
    const-string v1, "search"

    .line 178
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 179
    iget-object v1, p0, Ll/ܶۗۚ;->ܺ:Ll/ܺ᩵ۚ;

    new-instance v2, Ll/ۘ۫ۚ;

    .line 15
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 179
    invoke-virtual {v1, v0, p1, v2}, Ll/ܺ᩵ۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;Ll/ۘ۫ۚ;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_b
    .catch Ll/ۢܳۚ; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_a
    :try_start_c
    const-string v1, "xref"

    .line 180
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 181
    iget-object v1, p0, Ll/ܶۗۚ;->ܶ:Ll/۟᩵ۚ;

    invoke-virtual {v1, v0, p1}, Ll/۟᩵ۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_c
    .catch Ll/ۢܳۚ; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_b
    :try_start_d
    const-string v1, "resource_xref"

    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 183
    iget-object v1, p0, Ll/ܶۗۚ;->᩻:Ll/֫᩵ۚ;

    invoke-virtual {v1, v0, p1}, Ll/֫᩵ۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_d
    .catch Ll/ۢܳۚ; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_c
    :try_start_e
    const-string v1, "native_items"

    .line 184
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 185
    iget-object v1, p0, Ll/ܶۗۚ;->ᩴ:Ll/ۛܺۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۛܺۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_e
    .catch Ll/ۢܳۚ; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :cond_d
    :try_start_f
    const-string v1, "native_xref"

    .line 186
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    .line 187
    iget-object v1, p0, Ll/ܶۗۚ;->ܳ:Ll/ۜܺۚ;

    invoke-virtual {v1, v0, p1}, Ll/ۜܺۚ;->ۙ(Ll/ܰ۫ۚ;Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_f
    .catch Ll/ۢܳۚ; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    .line 190
    :cond_e
    :try_start_10
    invoke-virtual {p1, v8}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, v8, v5}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    .line 189
    invoke-static {v7, v8, p1, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1
    :try_end_10
    .catch Ll/ۢܳۚ; {:try_start_10 .. :try_end_10} :catch_0
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catch_0
    move-exception p1

    .line 193
    :try_start_11
    iget-boolean v0, p1, Ll/ۢܳۚ;->֡:Z

    if-eqz v0, :cond_f

    .line 194
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 196
    :cond_f
    throw p1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :catchall_0
    move-exception p1

    .line 199
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 200
    throw p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/ܶۗۚ;->᩸:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Copy nextActions[].arguments.workspaceId. Without an action, use data.workspaceId from the result containing data.pagination.nextCursor (normally the id returned by mt_apk_workspace_open). For mt_apk_list_installed_apps use installed_apps; for mt_apk_list_available_apks use available_apks. These two listing values do not require opening a workspace.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Copy nextActions[].arguments.editSessionId. Without an action, use data.editSessionId from the result containing data.pagination.nextCursor. Use an empty string for the base APK and for mt_apk_list_available_apks or mt_apk_list_installed_apps. For edited content, use the id originally returned by mt_apk_session_create.\"\n  },\n  \"nextCursor\": {\n    \"type\": \"string\",\n    \"description\": \"Opaque cursor copied unchanged from nextActions[].arguments.nextCursor or data.pagination.nextCursor. Do not parse, construct, or modify it.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the continuation. Copy nextActions[].arguments.limit by default. For text reads use 1..2000 lines; for byte reads use 1..65536 bytes; for other pages use data.pagination.limitMax.\"\n  }\n}\n"

    .line 98
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ܶۗۚ;->᩸:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Continue APK Results"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Continue a paged APK result. Prefer the action with tool=mt_apk_continue and purpose=continue, copying its complete nextActions[].arguments. Otherwise construct the call from data.pagination.nextCursor as explained by the parameter descriptions. Continue when data.pagination.hasMore=true; a null totalAvailableCount means unknown and must not stop continuation. Other nextActions may be for inspection or retry, not pagination. Native disassembly continues through mt_apk_native_disassemble instead. Pass only the four continuation parameters, not the original tool\'s query or read arguments."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_continue"

    return-object v0
.end method

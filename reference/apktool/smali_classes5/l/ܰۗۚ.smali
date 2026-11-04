.class public final Ll/ܰۗۚ;
.super Ll/ᩳܳۚ;
.source "76EV"


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 4

    const-string v0, "destructiveHint"

    const/4 v1, 0x1

    const-string v2, "readOnlyHint"

    const/4 v3, 0x0

    .line 0
    invoke-static {v2, v0, v3, v1}, Ll/᩺᩸ۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;ZZ)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 47
    invoke-static {p1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 4

    .line 50
    invoke-virtual {p1}, Lbin/mt/json/JSONObject;->size()I

    move-result v0

    const/4 v1, 0x1

    const-string v2, "path"

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 53
    new-instance v0, Ll/ᩴ۫ۚ;

    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ll/᩷ܿۚ;

    .line 54
    invoke-static {}, Ll/ᩴᩴۚ;->ۙ()Ll/᩸ᩴۚ;

    move-result-object v2

    invoke-static {}, Ll/ᩴᩴۚ;->᩷()Ll/ۢܿۚ;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ll/᩷ܿۚ;-><init>(Ll/᩸ᩴۚ;Ll/ۢܿۚ;)V

    invoke-direct {v0, p1, v1}, Ll/ᩴ۫ۚ;-><init>(Ljava/lang/String;Ll/᩷ܿۚ;)V

    .line 55
    iget-object p1, v0, Ll/ᩴ۫ۚ;->ۙ:Ljava/lang/String;

    invoke-static {p1}, Ll/ۤۤۚ;->ۤ(Ljava/lang/String;)V

    .line 56
    invoke-static {}, Ll/ۧᩴۚ;->ۙ()Ll/ۧᩴۚ;

    .line 32
    invoke-static {v0}, Ll/᩻᩷ۚ;->ۙ(Ll/ᩴ۫ۚ;)Ll/᩸۫ۚ;

    move-result-object p1

    .line 57
    new-instance v0, Ll/֨ܳۚ;

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "status"

    .line 58
    invoke-virtual {p1}, Ll/᩸۫ۚ;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "message"

    invoke-virtual {p1}, Ll/᩸۫ۚ;->ۙ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 57
    invoke-static {p1, v1}, Ll/ܳۧۤ;->ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/֨ܳۚ;-><init>(Lbin/mt/json/JSONObject;)V

    return-object v0

    .line 51
    :cond_0
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v3, "Expected only a string path."

    invoke-static {v3, v2, p1, v0, v1}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    throw p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    const-string v0, "{\"path\":{\"type\":\"string\",\"description\":\"Non-empty path to one readable APK on the phone, absolute or relative to Home. Example: MTestApp-Beta.apk.\"}}\n"

    .line 31
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Install APK"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 5

    .line 37
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "user_action_required"

    const-string v2, "started"

    const-string v3, "installed"

    const-string v4, "failed"

    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "installed: confirmed success; failed: installation could not start or failed; see message; user_action_required: follow message to continue on the phone; started: installation was submitted; final outcome is unknown. For user_action_required or started, check the outcome on the phone before retrying. No polling tool is provided."

    .line 38
    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;[Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Result explanation or the action needed on the phone."

    const-string v2, "string"

    const-string v3, "message"

    const-string v4, "Observed installation outcome. A successful tool call alone does not confirm installation success."

    .line 0
    invoke-static {v0, v2, v1, v3, v4}, Ll/᩸ۨۧ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "Request validation or dispatch error."

    .line 43
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2, v1}, Ll/ۤܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Ll/ۤܳۚ;->᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "No automatic follow-up actions."

    .line 44
    invoke-static {v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "APK installation request result."

    .line 36
    invoke-static {v3, v0, v1, v2}, Ll/ۤܳۚ;->ۙ(Ljava/lang/String;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Install one existing APK file on the phone using MT\'s installation settings. The phone may require installation permission or user confirmation. Installation may replace an installed version. Split APK sets and APKs inside archives are not supported."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_install"

    return-object v0
.end method

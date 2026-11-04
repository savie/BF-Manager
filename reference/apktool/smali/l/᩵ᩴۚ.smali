.class public final Ll/᩵ᩴۚ;
.super Ljava/lang/Object;
.source "H79P"


# instance fields
.field public final ۙ:Ll/ܺᩴۚ;

.field public final ۤ:Ll/ۡܳۚ;

.field public final ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x92

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    return-void
.end method

.method public constructor <init>(Ll/ܺᩴۚ;Lbin/mt/json/JSONObject;Ll/ۡܳۚ;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/᩵ᩴۚ;->ۙ:Ll/ܺᩴۚ;

    .line 23
    iput-object p2, p0, Ll/᩵ᩴۚ;->᩷:Lbin/mt/json/JSONObject;

    .line 24
    iput-object p3, p0, Ll/᩵ᩴۚ;->ۤ:Ll/ۡܳۚ;

    return-void
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 2

    .line 138
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    .line 139
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 145
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, "Invalid "

    .line 143
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 48
    invoke-static {p0, v0, v0, v0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p0

    .line 143
    throw p0

    :cond_2
    :goto_0
    return-object v0
.end method

.method private ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;
    .locals 3

    .line 94
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "protocolVersion"

    .line 95
    invoke-virtual {v0, v1, p1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "serverInfo"

    iget-object v1, p0, Ll/᩵ᩴۚ;->᩷:Lbin/mt/json/JSONObject;

    .line 96
    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 97
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "tools"

    .line 98
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "capabilities"

    .line 97
    invoke-virtual {p1, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private ۤ(Lbin/mt/json/JSONObject;)Ljava/lang/String;
    .locals 2

    const-string v0, "params"

    .line 105
    invoke-static {p1, v0}, Ll/᩵ᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "protocolVersion"

    .line 109
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 110
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 113
    iget-object v0, p0, Ll/᩵ᩴۚ;->ۙ:Ll/ܺᩴۚ;

    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܺᩴۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Invalid protocolVersion"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    .line 111
    throw p1

    :cond_1
    const-string p1, "Missing protocolVersion"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    .line 107
    throw p1
.end method

.method private ᩷(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const-string v1, "name"

    .line 123
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 124
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "arguments"

    .line 127
    invoke-static {p1, v0}, Ll/᩵ᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    .line 129
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object p1

    .line 131
    :cond_0
    iget-object v0, p0, Ll/᩵ᩴۚ;->ۤ:Ll/ۡܳۚ;

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ll/ۡܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p1, "Missing name"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    .line 125
    throw p1

    :cond_2
    const-string p1, "Missing params"

    .line 48
    invoke-static {p1, v0, v0, v0, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    .line 121
    throw p1
.end method


# virtual methods
.method public native ۙ(Lbin/mt/json/JSONObject;)Ll/ۗᩴۚ;
.end method

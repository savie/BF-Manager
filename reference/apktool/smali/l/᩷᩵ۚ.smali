.class public final Ll/᩷᩵ۚ;
.super Ll/ᩳܳۚ;
.source "M779"


# instance fields
.field public ۙ:Lbin/mt/json/JSONObject;

.field public final ۤ:Ll/ᩴ᩵ۚ;

.field public ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method public constructor <init>(Ll/ᩴ᩵ۚ;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 27
    iput-object p1, p0, Ll/᩷᩵ۚ;->ۤ:Ll/ᩴ᩵ۚ;

    return-void
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 47
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

    .line 140
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    .line 141
    iget-object v1, p1, Ll/ۢܳۚ;->۟:Lbin/mt/json/JSONArray;

    invoke-static {p1, v0, v1}, Ll/ܳۧۤ;->ۙ(Ll/ۢܳۚ;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
    .locals 1

    .line 133
    :try_start_0
    iget-object v0, p0, Ll/᩷᩵ۚ;->ۤ:Ll/ᩴ᩵ۚ;

    invoke-static {p1}, Ll/ۘ᩵ۚ;->ۛ(Lbin/mt/json/JSONObject;)Ll/ۜۨۚ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ᩴ᩵ۚ;->ۙ(Ll/ۜۨۚ;)Ll/֨ܳۚ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    sget v0, Ll/᩺۫ۚ;->ۙ:I

    return-object p1

    :catchall_0
    move-exception p1

    sget v0, Ll/᩺۫ۚ;->ۙ:I

    .line 137
    throw p1
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/᩷᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to read the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"reads\": {\n    \"type\": \"array\",\n    \"description\": \"Resource reads. Runtime accepts 1..200 items. Each item reads one exact resource locator and one concrete public variant.\",\n    \"items\": {\n      \"type\": \"object\",\n      \"additionalProperties\": false,\n      \"description\": \"One resource value read.\",\n      \"properties\": {\n        \"locator\": {\n          \"type\": \"string\",\n          \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n        },\n        \"variant\": {\n          \"type\": \"string\",\n          \"description\": \"Concrete public resource variant to read, such as default; not wildcard *.\"\n        }\n      },\n      \"required\": [\n        \"locator\",\n        \"variant\"\n      ]\n    }\n  },\n  \"maxValueChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum characters for the decoded value summary only. Suggested value is 4096; allowed range is 1..32768. valueTruncated=true only means this summary was cut; the exact full summary length is not returned.\"\n  },\n  \"maxValueXmlChars\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum characters for complete valueXml. Suggested value is 32768; allowed range is 1..1048576. valueXml is omitted rather than returned partially when it exceeds this budget.\"\n  },\n  \"maxItemsPerValue\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum item_list children returned per result. Suggested value is 50; allowed range is 0..2000. This does not affect valueXml.\"\n  },\n  \"resolveDepth\": {\n    \"type\": \"integer\",\n    \"description\": \"Use 0 for no reference summary or 1 for a direct referenced-resource summary. Suggested value is 0. The summary selects the same variant, then default, then the first sorted available variant; this is not Android device configuration matching.\"\n  }\n}\n"

    .line 55
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩷᩵ۚ;->ۙ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Read APK Resource"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 111
    iget-object v0, p0, Ll/᩷᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 114
    :cond_0
    invoke-static {}, Ll/ۜۗۚ;->ᩴ()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/᩷᩵ۚ;->᩷:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Batch-read resources.arsc values by exact resource locators and concrete variants in reads[]. Item-level missing-resource or missing-variant failures do not stop the batch; argument errors or an unreadable table fail the tool. To edit, first create a session with mt_apk_session_create if needed, then re-read the same locator and variant with its non-empty editSessionId. Use mt_apk_resource_edit only when editable=true and complete valueXml is available; targetVersion alone is insufficient."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_resource_read"

    return-object v0
.end method

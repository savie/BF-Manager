.class public final Ll/ۨۗۚ;
.super Ll/ᩳܳۚ;
.source "V77Q"


# static fields
.field private static final ۛۙۘ:[S


# instance fields
.field public ۙ:Lbin/mt/json/JSONObject;

.field public final ۤ:Ll/֫ۨۚ;

.field public ᩷:Lbin/mt/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x66

    invoke-static {v0}, Ll/᩹֡֫;->ۗ۟᩸(I)V

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۨۗۚ;->ۛۙۘ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x150s
        0x59ads
        0x59b5s
        0x59a8s
        0x59b1s
        0x59a9s
        0x59aas
        0x59bbs
        0x59b9s
        0x59bfs
        0x5993s
        0x59bes
        0x59bfs
        0x59bes
        0x59b3s
        0x59aes
        0x5989s
        0x59bfs
        0x59a9s
        0x59a9s
        0x59b3s
        0x59b5s
        0x59b4s
        0x5993s
        0x59bes
    .end array-data
.end method

.method public constructor <init>(Ll/֫ۨۚ;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ll/ᩳܳۚ;-><init>()V

    .line 30
    iput-object p1, p0, Ll/ۨۗۚ;->ۤ:Ll/֫ۨۚ;

    return-void
.end method


# virtual methods
.method public final ۙ()Lbin/mt/json/JSONObject;
    .locals 3

    .line 53
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "readOnlyHint"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public final ۙ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;
    .locals 0

    .line 84
    invoke-static {p1}, Ll/ۛۗۚ;->ۤ(Ll/ۢܳۚ;)Lbin/mt/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public native ۙ(Lbin/mt/json/JSONObject;)Ll/֨ܳۚ;
.end method

.method public final ۤ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ۨۗۚ;->ۙ:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  }\n}\n"

    .line 61
    invoke-static {v0}, Ll/ۜۚܺ;->ۙ(Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۗۚ;->ۙ:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Create APK Edit Session"

    return-object v0
.end method

.method public final ᩴ()Lbin/mt/json/JSONObject;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۨۗۚ;->᩷:Lbin/mt/json/JSONObject;

    if-eqz v0, :cond_0

    return-object v0

    .line 76
    :cond_0
    invoke-static {}, Ll/ۛۗۚ;->᩷()Lbin/mt/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Ll/ۨۗۚ;->᩷:Lbin/mt/json/JSONObject;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    const-string v0, "Create an isolated APK edit session from an immutable workspace. Choose semantic write tools when applicable: use mt_apk_native_patch_instructions for executable ELF instructions, mt_apk_native_patch_string for ELF UTF-8 strings, mt_apk_edit_text for text targets, and mt_apk_resource_edit for resource values. Use mt_apk_patch_bytes as the raw-byte fallback only when exact bytes are intentionally required or no semantic editor applies. The base workspace remains unchanged, and multiple sessions for the same workspace are independent. Pass the returned editSessionId to every follow-up read, search, analyze, continue, edit, check, or build tool that accepts editSessionId; use an empty string only when you intentionally want the base workspace."

    return-object v0
.end method

.method public final ᩸()Ljava/lang/String;
    .locals 1

    const-string v0, "mt_apk_session_create"

    return-object v0
.end method

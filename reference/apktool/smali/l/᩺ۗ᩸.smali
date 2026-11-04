.class public final synthetic Ll/᩺ۗ᩸;
.super Ljava/lang/Object;
.source "16SF"

# interfaces
.implements Ll/ۙܿۚ;
.implements Ll/ܰܺۧ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺ۗ᩸;->ܰ:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺ۗ᩸;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۗ᩸;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺ۗ᩸;->ܰ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 4

    .line 2
    iget-object v0, p0, Ll/᩺ۗ᩸;->᩶:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 6
    iget-object v1, p0, Ll/᩺ۗ᩸;->ܰ:Ljava/lang/Object;

    .line 8
    check-cast v1, Ljava/lang/String;

    const-string v2, "path"

    const-string v3, "policyRevision"

    .line 0
    invoke-static {v2, v0, v3, v1}, Ll/᩷ܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "operation"

    const-string v2, "check_parent_links"

    .line 485
    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "backendReason"

    .line 486
    invoke-virtual {v0, v1, p3}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "changed"

    const/4 v1, 0x0

    .line 487
    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "stateKnown"

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Z)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "warnings"

    .line 488
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p3

    const-string v0, "fatal"

    const/4 v1, 0x0

    .line 482
    invoke-static {p1, p2, v0, v1, p3}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 8

    .line 0
    iget-object v0, p0, Ll/᩺ۗ᩸;->ܰ:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll/᩶ܺۧ;

    iget-object v0, p0, Ll/᩺ۗ᩸;->᩶:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Set;

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    invoke-static/range {v1 .. v7}, Ll/᩶ܺۧ;->ۙ(Ll/᩶ܺۧ;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

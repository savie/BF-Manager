.class public final synthetic Ll/ۛۤᩴ;
.super Ljava/lang/Object;
.source "96RH"

# interfaces
.implements Ll/֫ܶ᩵;
.implements Ll/ܿ֫ܺ;
.implements Ll/ۙܿۚ;
.implements Ll/֨ۜ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouchExplorationStateChanged(Z)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/search/SearchBar;

    invoke-static {v0, p1}, Lcom/google/android/material/search/SearchBar;->$r8$lambda$A6oc-mkGKwylX2wCFRWSDnYCuP0(Lcom/google/android/material/search/SearchBar;Z)V

    return-void
.end method

.method public ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/ۢܳۚ;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/᩷ۨᩴ;

    .line 103
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "path"

    invoke-virtual {v0}, Ll/᩷ۨᩴ;->ܺۙ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v1, "FILE_PARENT_NOT_FOUND"

    .line 104
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "parent_missing"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "FILE_NOT_DIRECTORY"

    .line 105
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "regular"

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    const-string p3, "warning"

    .line 107
    invoke-static {p1, p2, p3, v2, v0}, Ll/ۢܳۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p3, "fatal"

    .line 109
    invoke-static {p1, p2, p3, v2, v0}, Ll/ۢܳۚ;->᩷(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۢܳۚ;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/۬ܰᩴ;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/۬ܰᩴ;->ۙ(Ljava/lang/String;)V

    return-void
.end method

.method public ᩷(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ۛۤᩴ;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/۠᩹᩸;

    .line 6
    check-cast p1, Ljava/lang/Void;

    .line 187
    invoke-virtual {v0, p2}, Ll/۠᩹᩸;->ۙ(Ljava/lang/Throwable;)V

    return-void
.end method

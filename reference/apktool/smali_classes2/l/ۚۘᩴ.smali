.class public final Ll/ۚۘᩴ;
.super Ljava/lang/Object;
.source "U6G1"


# instance fields
.field public final ۙ:Ljava/util/HashMap;

.field public final ᩷:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚۘᩴ;->᩷:Ljava/util/HashMap;

    .line 18
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۚۘᩴ;->ۙ:Ljava/util/HashMap;

    return-void
.end method

.method public static ۙ(Ljava/util/Map;)Lbin/mt/json/JSONObject;
    .locals 6

    .line 120
    new-instance v0, Lbin/mt/json/JSONObject;

    invoke-direct {v0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 121
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 122
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2}, Lbin/mt/json/JSONObject;-><init>()V

    .line 123
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 124
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v2, v5, v4}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    goto :goto_1

    .line 126
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ۙ(Lbin/mt/json/JSONValue;)Ljava/util/HashMap;
    .locals 7

    .line 101
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    if-eqz p0, :cond_4

    .line 102
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 103
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONObject$Member;

    .line 104
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 105
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 106
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbin/mt/json/JSONObject$Member;

    .line 107
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v5

    invoke-virtual {v5}, Lbin/mt/json/JSONValue;->isNumber()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    .line 109
    :cond_2
    :try_start_0
    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v4

    invoke-virtual {v4}, Lbin/mt/json/JSONValue;->asInt()I

    move-result v4

    const/4 v6, 0x0

    invoke-static {v6, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    .line 114
    :cond_3
    invoke-virtual {v1}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    :goto_2
    return-object v0
.end method

.method public static ۙ()Ll/ۚۘᩴ;
    .locals 5

    .line 24
    new-instance v0, Ll/ۚۘᩴ;

    invoke-direct {v0}, Ll/ۚۘᩴ;-><init>()V

    .line 25
    sget-object v1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    const-string v2, "omuc"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 28
    :try_start_0
    new-instance v2, Lbin/mt/json/JSONObject;

    invoke-direct {v2, v1}, Lbin/mt/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "v"

    const/4 v3, 0x0

    .line 30
    invoke-virtual {v2, v1, v3}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    iget-object v1, v0, Ll/ۚۘᩴ;->᩷:Ljava/util/HashMap;

    const-string v3, "purposes"

    invoke-virtual {v2, v3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-static {v3}, Ll/ۚۘᩴ;->ۙ(Lbin/mt/json/JSONValue;)Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    const-string v1, "formats"

    .line 32
    invoke-virtual {v2, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 33
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 34
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lbin/mt/json/JSONObject;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbin/mt/json/JSONObject$Member;

    .line 35
    iget-object v3, v0, Ll/ۚۘᩴ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v2}, Lbin/mt/json/JSONObject$Member;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lbin/mt/json/JSONObject$Member;->getValue()Lbin/mt/json/JSONValue;

    move-result-object v2

    invoke-static {v2}, Ll/ۚۘᩴ;->ۙ(Lbin/mt/json/JSONValue;)Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lbin/mt/json/JSONParseException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    :goto_1
    return-object v0
.end method

.method public static ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z
    .locals 2

    .line 88
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 91
    invoke-interface {p2, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    const/4 p2, 0x0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    .line 94
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    :goto_0
    const v1, 0x7fffffff

    if-ne p0, v1, :cond_2

    return p2

    :cond_2
    const/4 p2, 0x1

    add-int/2addr p0, p2

    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return p2
.end method

.method public static ۤ(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)V
    .locals 4

    .line 57
    invoke-static {}, Ll/ۚۘᩴ;->ۙ()Ll/ۚۘᩴ;

    move-result-object v0

    iget-object v1, v0, Ll/ۚۘᩴ;->᩷:Ljava/util/HashMap;

    iget-object v0, v0, Ll/ۚۘᩴ;->ۙ:Ljava/util/HashMap;

    .line 58
    invoke-interface {p1}, Ll/ܺۛᩴ;->ۤ()Landroid/content/ComponentName;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p1

    .line 60
    iget-object v2, p0, Ll/۫ۘᩴ;->ۙ:Ljava/lang/String;

    iget-object p0, p0, Ll/۫ۘᩴ;->᩷:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 61
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_0

    .line 63
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 64
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_0
    invoke-static {p0, p1, v3}, Ll/ۚۘᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 69
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {p0, p1, v1}, Ll/ۚۘᩴ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Z

    move-result p0

    or-int/2addr v2, p0

    :cond_2
    if-eqz v2, :cond_4

    .line 71
    new-instance p0, Lbin/mt/json/JSONObject;

    invoke-direct {p0}, Lbin/mt/json/JSONObject;-><init>()V

    .line 72
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 73
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Ll/ۚۘᩴ;->ۙ(Ljava/util/Map;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    goto :goto_1

    .line 75
    :cond_3
    new-instance p1, Lbin/mt/json/JSONObject;

    invoke-direct {p1}, Lbin/mt/json/JSONObject;-><init>()V

    const-string v0, "v"

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;I)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "purposes"

    .line 76
    invoke-static {v1}, Ll/ۚۘᩴ;->ۙ(Ljava/util/Map;)Lbin/mt/json/JSONObject;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p1

    const-string v0, "formats"

    invoke-virtual {p1, v0, p0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Lbin/mt/json/JSONValue;)Lbin/mt/json/JSONObject;

    move-result-object p0

    .line 77
    sget-object p1, Ll/ܽܿ֫;->֡:Ll/ۢ֫ܺ;

    invoke-interface {p1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p1

    const-string v0, "omuc"

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->apply()V

    :cond_4
    return-void
.end method


# virtual methods
.method public final ۙ(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)I
    .locals 2

    .line 46
    iget-object v0, p0, Ll/ۚۘᩴ;->ۙ:Ljava/util/HashMap;

    iget-object v1, p1, Ll/۫ۘᩴ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object p1, p1, Ll/۫ۘᩴ;->᩷:Ljava/lang/String;

    check-cast p2, Ll/ܽۘᩴ;

    invoke-virtual {p2}, Ll/ܽۘᩴ;->ۤ()Landroid/content/ComponentName;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    goto :goto_0

    .line 82
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    .line 83
    :cond_1
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Integer;

    :goto_1
    if-nez v1, :cond_2

    const/4 p1, 0x0

    return p1

    .line 84
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public final ᩷(Ll/۫ۘᩴ;Ll/ܺۛᩴ;)I
    .locals 3

    .line 50
    iget-object v0, p1, Ll/۫ۘᩴ;->᩷:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 51
    :cond_0
    iget-object p1, p1, Ll/۫ۘᩴ;->᩷:Ljava/lang/String;

    check-cast p2, Ll/ܽۘᩴ;

    invoke-virtual {p2}, Ll/ܽۘᩴ;->ۤ()Landroid/content/ComponentName;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/ComponentName;->flattenToString()Ljava/lang/String;

    move-result-object p2

    .line 82
    iget-object v0, p0, Ll/ۚۘᩴ;->᩷:Ljava/util/HashMap;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    move-object p1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    :goto_0
    if-nez p1, :cond_2

    goto :goto_1

    .line 83
    :cond_2
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Integer;

    :goto_1
    if-nez v2, :cond_3

    return v1

    .line 84
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

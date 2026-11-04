.class public final Ll/ᩴۧܳ;
.super Ljava/lang/Object;
.source "N6JA"


# static fields
.field public static ۧ:Ll/ᩴۧܳ;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۙ:Ljava/util/HashMap;

.field public final ۚ:Ll/ۢ֫ܺ;

.field public ۤ:Z

.field public final ۫:Ljava/util/LinkedHashSet;

.field public ܳ:Z

.field public ᩴ:Z

.field public final ᩷:Ll/ۛۧܳ;

.field public final ᩸:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Ll/ۢ֫ܺ;Ll/ۛۧܳ;)V
    .locals 11

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ᩴۧܳ;->᩸:Ljava/util/LinkedHashMap;

    .line 33
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v1, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    .line 34
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Ll/ᩴۧܳ;->ۙ:Ljava/util/HashMap;

    .line 35
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Ll/ᩴۧܳ;->֫:Ljava/util/ArrayList;

    .line 47
    iput-object p1, p0, Ll/ᩴۧܳ;->ۚ:Ll/ۢ֫ܺ;

    .line 48
    iput-object p2, p0, Ll/ᩴۧܳ;->᩷:Ll/ۛۧܳ;

    const-string p2, "hpst"

    const-string v2, ""

    .line 152
    invoke-interface {p1, p2, v2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 153
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/high16 v2, 0x100000

    if-le p2, v2, :cond_0

    goto/16 :goto_3

    .line 155
    :cond_0
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "version"

    .line 156
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p1, "entries"

    .line 157
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const-string v3, "pending"

    .line 158
    invoke-virtual {p2, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    .line 159
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 160
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_6

    .line 161
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v6

    .line 162
    invoke-virtual {v6, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 163
    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 195
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x20

    if-ne v8, v9, :cond_5

    const/4 v8, 0x0

    .line 196
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v8, v9, :cond_4

    .line 197
    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x30

    if-lt v9, v10, :cond_2

    const/16 v10, 0x39

    if-le v9, v10, :cond_3

    :cond_2
    const/16 v10, 0x61

    if-lt v9, v10, :cond_5

    const/16 v10, 0x66

    if-gt v9, v10, :cond_5

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 164
    :cond_4
    invoke-static {v6}, Ll/ᩴۧܳ;->ۙ(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v3, v6}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 165
    invoke-virtual {v0, v7, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    new-instance p1, Lorg/json/JSONException;

    const-string p2, "Invalid preview entry"

    invoke-direct {p1, p2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 167
    :cond_6
    :goto_2
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-ge v4, p1, :cond_8

    .line 168
    invoke-virtual {p2, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 169
    invoke-static {p1}, Ll/ᩴۧܳ;->ۙ(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 170
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 169
    :cond_7
    new-instance p1, Lorg/json/JSONException;

    const-string p2, "Invalid preview origin"

    invoke-direct {p1, p2}, Lorg/json/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :cond_8
    iput-boolean v2, p0, Ll/ᩴۧܳ;->ᩴ:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 175
    :catch_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 176
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    :cond_9
    :goto_3
    return-void
.end method

.method public static ۙ(Ll/ۖ֫ܳ;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 64
    iget-object v0, p0, Ll/ۖ֫ܳ;->ۤ:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p0, p0, Ll/ۖ֫ܳ;->᩷:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    invoke-static {p1}, Ll/ۖ֫ܳ;->᩸(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 65
    invoke-static {p0}, Ll/ܳ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۙ(Ll/ᩴۧܳ;)Ljava/util/HashMap;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۧܳ;->ۙ:Ljava/util/HashMap;

    return-object p0
.end method

.method public static ۙ(Landroid/content/Context;)Ll/ᩴۧܳ;
    .locals 3

    .line 54
    sget-object v0, Ll/ᩴۧܳ;->ۧ:Ll/ᩴۧܳ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ᩴۧܳ;->ۚ:Ll/ۢ֫ܺ;

    sget-object v1, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    if-eq v0, v1, :cond_1

    .line 55
    :cond_0
    new-instance v0, Ll/ᩴۧܳ;

    sget-object v1, Ll/᩶᩷ۧ;->۫:Ll/ۢ֫ܺ;

    new-instance v2, Ll/ۛۧܳ;

    .line 56
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v2, p0}, Ll/ۛۧܳ;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1, v2}, Ll/ᩴۧܳ;-><init>(Ll/ۢ֫ܺ;Ll/ۛۧܳ;)V

    sput-object v0, Ll/ᩴۧܳ;->ۧ:Ll/ᩴۧܳ;

    .line 58
    :cond_1
    sget-object p0, Ll/ᩴۧܳ;->ۧ:Ll/ᩴۧܳ;

    return-object p0
.end method

.method private ۙ(Ljava/util/LinkedHashSet;)V
    .locals 5

    .line 129
    iget-object v0, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 130
    iget-object v2, p0, Ll/ᩴۧܳ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    const/4 p1, 0x0

    .line 136
    iput-boolean p1, p0, Ll/ᩴۧܳ;->ۤ:Z

    return-void

    :cond_2
    const/4 v0, 0x1

    .line 140
    iput-boolean v0, p0, Ll/ᩴۧܳ;->ۤ:Z

    .line 141
    new-instance v0, Ll/ۤۧܳ;

    invoke-direct {v0, p0, v1, p1}, Ll/ۤۧܳ;-><init>(Ll/ᩴۧܳ;Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    iget-object p1, p0, Ll/ᩴۧܳ;->᩷:Ll/ۛۧܳ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-static {v1}, Ll/ᩴۧܳ;->ۙ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 74
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1}, Ll/ۤۧܳ;->accept(Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string v2, "https://"

    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DELETE_BROWSING_DATA"

    .line 78
    invoke-static {v2}, Ll/ۧ᩻ܺ;->᩷(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 80
    new-instance v2, Ll/ܺۧܳ;

    invoke-direct {v2, p1, v0}, Ll/ܺۧܳ;-><init>(Ll/ۛۧܳ;Ljava/util/function/Consumer;)V

    .line 82
    :try_start_0
    invoke-static {}, Landroid/webkit/WebStorage;->getInstance()Landroid/webkit/WebStorage;

    move-result-object p1

    new-instance v0, Ll/֫ۧܳ;

    invoke-direct {v0, v2}, Ll/֫ۧܳ;-><init>(Ll/ܺۧܳ;)V

    .line 153
    new-instance v3, Ll/ᩴ۬᩷;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 130
    sget-object v4, Ll/ᩴۙۤ;->ۤ:Ll/ܶ۬᩷;

    .line 131
    invoke-virtual {v4}, Ll/᩺۬᩷;->ۤ()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 159
    invoke-static {}, Ll/ۚۙۤ;->ۤ()Ll/᩹ۗܶ;

    move-result-object v4

    invoke-virtual {v4, p1}, Ll/᩹ۗܶ;->ۙ(Landroid/webkit/WebStorage;)Ll/ۙۙۤ;

    move-result-object p1

    .line 132
    invoke-virtual {p1, v1, v3, v0}, Ll/ۙۙۤ;->deleteBrowsingDataForSite(Ljava/lang/String;Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)Ljava/lang/String;

    return-void

    .line 134
    :cond_4
    invoke-static {}, Ll/ᩴۙۤ;->ۙ()Ljava/lang/UnsupportedOperationException;

    move-result-object p1

    throw p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    :catch_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v2, p1}, Ll/ܺۧܳ;->ۙ(Ljava/lang/Boolean;)V

    return-void

    .line 88
    :cond_5
    new-instance v2, Ll/ۨۧܳ;

    invoke-direct {v2, p1, v1, v0}, Ll/ۨۧܳ;-><init>(Ll/ۛۧܳ;Ljava/lang/String;Ll/ۤۧܳ;)V

    invoke-virtual {v2}, Ll/ۨۧܳ;->ۙ()V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴۧܳ;Ljava/lang/Boolean;)V
    .locals 3

    .line 79
    iget-object v0, p0, Ll/ᩴۧܳ;->֫:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ll/ᩴۧܳ;->ܳ:Z

    .line 80
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iput-boolean v2, p0, Ll/ᩴۧܳ;->ᩴ:Z

    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ll/ᩴۧܳ;->ۙ()Z

    move-result p1

    if-nez p1, :cond_0

    iput-boolean v1, p0, Ll/ᩴۧܳ;->ᩴ:Z

    .line 82
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Consumer;

    iget-boolean v1, p0, Ll/ᩴۧܳ;->ᩴ:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴۧܳ;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/lang/Boolean;)V
    .locals 0

    .line 142
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    .line 143
    iget-object p3, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-virtual {p3, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 144
    invoke-direct {p0}, Ll/ᩴۧܳ;->ۙ()Z

    .line 147
    :cond_0
    invoke-direct {p0, p2}, Ll/ᩴۧܳ;->ۙ(Ljava/util/LinkedHashSet;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/ᩴۧܳ;Ljava/lang/String;Ll/ۨۖ֫;Ljava/lang/Boolean;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-direct {p0, p1, p2}, Ll/ᩴۧܳ;->᩷(Ljava/lang/String;Ll/ۨۖ֫;)V

    return-void

    :cond_0
    const/4 p0, 0x0

    .line 74
    invoke-virtual {p2, p0}, Ll/ۨۖ֫;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method private ۙ()Z
    .locals 5

    .line 182
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 183
    iget-object v1, p0, Ll/ᩴۧܳ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 184
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 186
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "version"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "entries"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "pending"

    new-instance v2, Lorg/json/JSONArray;

    iget-object v3, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-direct {v2, v3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 187
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    .line 188
    iget-object v1, p0, Ll/ᩴۧܳ;->ۚ:Ll/ۢ֫ܺ;

    invoke-interface {v1}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object v1

    const-string v2, "hpst"

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object v0

    invoke-interface {v0}, Ll/ᩳ֫ܺ;->commit()Z

    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 190
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static ۙ(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "preview-"

    .line 205
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v0, ".invalid"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 0
    invoke-static {v0, v0, p0}, Ll/֨᩵ᩴ;->ۙ(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 208
    :try_start_0
    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_1
    :goto_0
    return v1
.end method

.method public static bridge synthetic ۤ(Ll/ᩴۧܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴۧܳ;->ۙ()Z

    return-void
.end method

.method private ᩷()V
    .locals 5

    .line 113
    iget-object v0, p0, Ll/ᩴۧܳ;->᩸:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 114
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    move-result v2

    const/16 v3, 0x40

    if-le v2, v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 115
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 116
    iget-object v3, p0, Ll/ᩴۧܳ;->ۙ:Ljava/util/HashMap;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 117
    :cond_0
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩷(Ljava/lang/String;Ll/ۨۖ֫;)V
    .locals 4

    .line 94
    iget-object v0, p0, Ll/ᩴۧܳ;->᩸:Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    if-nez p1, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :goto_0
    if-nez v2, :cond_1

    .line 95
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "preview-"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ".invalid"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-nez p1, :cond_2

    .line 96
    iget-object p1, p0, Ll/ᩴۧܳ;->۫:Ljava/util/LinkedHashSet;

    invoke-virtual {p1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v0, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    :goto_1
    iget-object p1, p0, Ll/ᩴۧܳ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const/4 v3, 0x1

    if-nez v0, :cond_3

    goto :goto_2

    .line 99
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v3, v0

    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    new-instance p1, Ll/᩸ۧܳ;

    invoke-direct {p1, p0, v2}, Ll/᩸ۧܳ;-><init>(Ll/ᩴۧܳ;Ljava/lang/String;)V

    .line 101
    invoke-direct {p0}, Ll/ᩴۧܳ;->᩷()V

    .line 103
    invoke-direct {p0}, Ll/ᩴۧܳ;->ۙ()Z

    move-result v0

    if-nez v0, :cond_4

    .line 104
    invoke-virtual {p1}, Ll/᩸ۧܳ;->close()V

    .line 105
    invoke-virtual {p2, v1}, Ll/ۨۖ֫;->accept(Ljava/lang/Object;)V

    return-void

    .line 108
    :cond_4
    invoke-virtual {p2, p1}, Ll/ۨۖ֫;->accept(Ljava/lang/Object;)V

    .line 123
    iget-boolean p1, p0, Ll/ᩴۧܳ;->ᩴ:Z

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Ll/ᩴۧܳ;->ۤ:Z

    if-eqz p1, :cond_5

    goto :goto_3

    .line 124
    :cond_5
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-direct {p0, p1}, Ll/ᩴۧܳ;->ۙ(Ljava/util/LinkedHashSet;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public static ᩷(Ll/ᩴۧܳ;)V
    .locals 1

    .line 123
    iget-boolean v0, p0, Ll/ᩴۧܳ;->ᩴ:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ᩴۧܳ;->ۤ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 124
    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-direct {p0, v0}, Ll/ᩴۧܳ;->ۙ(Ljava/util/LinkedHashSet;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩸(Ll/ᩴۧܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴۧܳ;->᩷()V

    return-void
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;Ll/ۨۖ֫;)V
    .locals 1

    .line 71
    iget-boolean v0, p0, Ll/ᩴۧܳ;->ᩴ:Z

    if-nez v0, :cond_1

    .line 72
    new-instance v0, Ll/ۙۧܳ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۙۧܳ;-><init>(Ll/ᩴۧܳ;Ljava/lang/String;Ll/ۨۖ֫;)V

    iget-object p1, p0, Ll/ᩴۧܳ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-boolean p1, p0, Ll/ᩴۧܳ;->ܳ:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    .line 77
    iput-boolean p1, p0, Ll/ᩴۧܳ;->ܳ:Z

    .line 78
    new-instance p1, Ll/᩷ۧܳ;

    invoke-direct {p1, p0}, Ll/᩷ۧܳ;-><init>(Ll/ᩴۧܳ;)V

    iget-object p2, p0, Ll/ᩴۧܳ;->᩷:Ll/ۛۧܳ;

    invoke-virtual {p2, p1}, Ll/ۛۧܳ;->ۙ(Ll/᩷ۧܳ;)V

    :cond_0
    return-void

    .line 90
    :cond_1
    invoke-direct {p0, p1, p2}, Ll/ᩴۧܳ;->᩷(Ljava/lang/String;Ll/ۨۖ֫;)V

    return-void
.end method

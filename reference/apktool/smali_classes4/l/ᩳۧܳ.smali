.class public final Ll/ᩳۧܳ;
.super Ljava/lang/Object;
.source "S6IR"


# static fields
.field public static final ᩷:Ll/ܽ֫ۗ;


# instance fields
.field public final ۙ:Ll/ۢ֫ܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 21
    new-instance v0, Ll/ܽ֫ۗ;

    invoke-direct {v0}, Ll/ܽ֫ۗ;-><init>()V

    sput-object v0, Ll/ᩳۧܳ;->᩷:Ll/ܽ֫ۗ;

    return-void
.end method

.method public constructor <init>(Ll/ۢ֫ܺ;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    return-void
.end method

.method public static ۙ(Ll/ۖ֫ܳ;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p0, :cond_1

    .line 31
    iget-object p0, p0, Ll/ۖ֫ܳ;->ۤ:Ljava/lang/String;

    if-nez p0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\u0000"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ܳ֫ܺ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ۙ()Lorg/json/JSONArray;
    .locals 3

    .line 83
    sget-object v0, Ll/ᩳۧܳ;->᩷:Ll/ܽ֫ۗ;

    iget-object v1, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    invoke-virtual {v0, v1}, Ll/ܽ֫ۗ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "mdph"

    const-string v2, ""

    .line 84
    invoke-interface {v1, v0, v2}, Ll/ۢ֫ܺ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 85
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/high16 v2, 0x100000

    if-gt v1, v2, :cond_1

    .line 87
    :try_start_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 92
    :catch_0
    :cond_1
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    return-object v0
.end method

.method public static synthetic ۙ(Ll/ᩳۧܳ;)V
    .locals 3

    .line 70
    iget-object v0, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    monitor-enter v0

    .line 71
    :try_start_0
    sget-object v1, Ll/ᩳۧܳ;->᩷:Ll/ܽ֫ۗ;

    iget-object v2, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    invoke-virtual {v1, v2}, Ll/ܽ֫ۗ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 73
    iget-object p0, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    invoke-interface {p0}, Ll/ۢ֫ܺ;->edit()Ll/ᩳ֫ܺ;

    move-result-object p0

    const-string v2, "mdph"

    invoke-interface {p0, v2, v1}, Ll/ᩳ֫ܺ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/ᩳ֫ܺ;

    move-result-object p0

    invoke-interface {p0}, Ll/ᩳ֫ܺ;->commit()Z

    .line 74
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final ۙ(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 12

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 39
    :cond_0
    iget-object v0, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    monitor-enter v0

    .line 40
    :try_start_0
    invoke-direct {p0}, Ll/ᩳۧܳ;->ۙ()Lorg/json/JSONArray;

    move-result-object v2

    const/4 v3, 0x0

    .line 41
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 42
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_1

    const-string v5, "key"

    .line 43
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "x"

    const-wide/high16 v6, -0x4010000000000000L    # -1.0

    .line 44
    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmpl-double v5, v8, v10

    if-ltz v5, :cond_1

    const-string v5, "y"

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v5

    cmpl-double v7, v5, v10

    if-ltz v7, :cond_1

    monitor-exit v0

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    .line 47
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ۙ(Ljava/lang/String;FFLjava/lang/String;)V
    .locals 5

    .line 52
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p2}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_6

    invoke-static {p3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    .line 53
    invoke-static {p3}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    cmpg-float v1, p2, v0

    if-ltz v1, :cond_6

    cmpg-float v0, p3, v0

    if-gez v0, :cond_0

    goto/16 :goto_4

    .line 54
    :cond_0
    iget-object v0, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    monitor-enter v0

    .line 56
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "key"

    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "x"

    float-to-double v3, p2

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    move-result-object p2

    const-string v1, "y"

    float-to-double v2, p3

    invoke-virtual {p2, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p4, :cond_1

    .line 57
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p3

    const v1, 0x186a0

    if-gt p3, v1, :cond_1

    const-string p3, "details"

    invoke-virtual {p2, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 58
    :cond_1
    new-instance p3, Lorg/json/JSONArray;

    invoke-direct {p3}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p3, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p3

    .line 59
    invoke-direct {p0}, Ll/ᩳۧܳ;->ۙ()Lorg/json/JSONArray;

    move-result-object p4

    .line 60
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v1, 0x0

    .line 61
    :goto_0
    invoke-virtual {p4}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_5

    invoke-virtual {p3}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/16 v3, 0x40

    if-ge v2, v3, :cond_5

    .line 62
    invoke-virtual {p4, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "key"

    .line 63
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    .line 64
    :cond_2
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v3, p2

    const p2, 0xffffe

    if-le v3, p2, :cond_3

    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {p3, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move p2, v3

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 68
    :cond_5
    :goto_2
    sget-object p1, Ll/ᩳۧܳ;->᩷:Ll/ܽ֫ۗ;

    iget-object p2, p0, Ll/ᩳۧܳ;->ۙ:Ll/ۢ֫ܺ;

    invoke-virtual {p3}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ll/ܽ֫ۗ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    sget-object p1, Ll/ۙ᩻ܺ;->᩷:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Ll/ۗܽܳ;

    const/4 p3, 0x1

    invoke-direct {p2, p3, p0}, Ll/ۗܽܳ;-><init>(ILjava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 77
    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 79
    :goto_3
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_6
    :goto_4
    return-void
.end method

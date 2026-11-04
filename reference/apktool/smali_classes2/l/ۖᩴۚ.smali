.class public final Ll/ۖᩴۚ;
.super Ljava/lang/Object;
.source "P6HY"


# instance fields
.field public final ۙ:Ljava/lang/StringBuilder;

.field public final ۤ:I

.field public ᩷:Z


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 872
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 869
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ۖᩴۚ;->ۙ:Ljava/lang/StringBuilder;

    .line 872
    iput p1, p0, Ll/ۖᩴۚ;->ۤ:I

    return-void
.end method

.method public static ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 756
    invoke-static {p0, p1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1258
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    .line 756
    :cond_0
    invoke-static {p0, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 1260
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p0, ""

    return-object p0

    :cond_1
    const p1, 0x7f120650

    const/4 p2, 0x0

    new-array v0, p2, [Ljava/lang/Object;

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 123
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    .line 128
    invoke-static {v0, p0, v1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p0

    iget-object p0, p0, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, p2

    aput-object p0, v0, v1

    const p0, 0x7f12061b

    .line 770
    invoke-static {p0, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۙ(ILjava/lang/String;Z)V
    .locals 3

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 770
    invoke-static {p1, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 123
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    .line 128
    invoke-static {v1, p2, v2}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p2

    iget-object p2, p2, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    aput-object p2, v1, v2

    const p1, 0x7f12061b

    .line 770
    invoke-static {p1, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 879
    invoke-direct {p0, p1, p3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method private ۙ(Ljava/lang/String;Z)V
    .locals 4

    .line 1063
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Ll/ۖᩴۚ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    iget v2, p0, Ll/ۖᩴۚ;->ۤ:I

    if-lt v1, v2, :cond_0

    goto :goto_1

    .line 1064
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/4 v3, 0x1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    sub-int v1, v2, v1

    if-gt v1, v3, :cond_1

    goto :goto_1

    .line 1065
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_2

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1066
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    sub-int/2addr v2, v1

    const/16 v1, 0x258

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1067
    invoke-static {v1, p1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p2, :cond_4

    .line 1068
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-le p1, v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_0
    iput-boolean v3, p0, Ll/ۖᩴۚ;->᩷:Z

    :cond_5
    :goto_1
    return-void
.end method

.method public static bridge synthetic ۙ(Ll/ۖᩴۚ;Lbin/mt/json/JSONObject;Ljava/lang/String;I)V
    .locals 0

    .line 0
    invoke-direct {p0, p3, p1, p2}, Ll/ۖᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public static ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1175
    invoke-virtual {p0, p1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 1176
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 1177
    :cond_0
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/16 p1, 0xdc

    const/4 v0, 0x1

    .line 128
    invoke-static {p1, p0, v0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p0

    iget-object p0, p0, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    return-object p0

    :cond_2
    :goto_1
    const-string p0, ""

    return-object p0
.end method

.method private ᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 3

    const-wide/16 v0, 0x0

    .line 974
    invoke-static {p2, p3, v0, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide p2

    cmp-long v2, p2, v0

    if-lez v2, :cond_0

    .line 975
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    .line 770
    invoke-static {p1, p3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public static ᩸(Ljava/lang/String;)Z
    .locals 4

    .line 1115
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x40

    if-le v0, v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 1116
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    .line 1117
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x2b

    if-eq v2, v3, :cond_2

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_2

    const/16 v3, 0x2e

    if-eq v2, v3, :cond_2

    const/16 v3, 0x65

    if-eq v2, v3, :cond_2

    const/16 v3, 0x45

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1121
    :cond_3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    .line 1122
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-static {v2, v3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_4

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_4
    :goto_1
    return v1
.end method

.method public static ᩻(Lbin/mt/json/JSONObject;)Z
    .locals 2

    const-string v0, "hasMore"

    .line 1374
    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "pagination"

    .line 1375
    invoke-static {p0, v1}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    .line 1376
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1402
    iget-object v0, p0, Ll/ۖᩴۚ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Ll/ۖᩴۚ;->ۤ:I

    invoke-static {v1, v0}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Lbin/mt/json/JSONObject;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "results"

    .line 904
    invoke-static {v1, v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "changedCount"

    const-wide/16 v4, 0x0

    .line 905
    invoke-static {v1, v3, v4, v5}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    const-string v3, "noOpCount"

    invoke-static {v1, v3, v4, v5}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v8

    .line 906
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 907
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v10

    const/4 v11, 0x1

    if-nez v10, :cond_0

    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v10

    const/16 v13, 0xc8

    if-gt v10, v13, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    const/4 v13, 0x0

    :goto_1
    const-string v14, "locator"

    const-string v15, "changed"

    if-eqz v10, :cond_4

    .line 908
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v12

    if-ge v13, v12, :cond_4

    .line 909
    invoke-static {v2, v13}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    .line 756
    invoke-static {v12, v14}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 911
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v16

    if-nez v16, :cond_2

    invoke-static {v12, v15}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v16

    if-nez v16, :cond_1

    invoke-static {v12, v15}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v16

    if-nez v16, :cond_1

    goto :goto_2

    .line 912
    :cond_1
    invoke-static {v12, v15}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v3, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v10, 0x0

    :cond_3
    :goto_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 914
    :cond_4
    invoke-static {v1, v15}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v1

    const v12, 0x7f12069c

    if-nez v1, :cond_7

    cmp-long v1, v6, v4

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    if-eqz v10, :cond_6

    .line 916
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v3, v11, [Ljava/lang/Object;

    const/4 v10, 0x0

    aput-object v1, v3, v10

    const v1, 0x7f1206bb

    .line 770
    invoke-static {v1, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v10}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_4

    :cond_6
    const/4 v10, 0x0

    .line 917
    :goto_4
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-array v3, v11, [Ljava/lang/Object;

    aput-object v1, v3, v10

    const v1, 0x7f120612

    .line 770
    invoke-static {v1, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v10, 0x0

    new-array v1, v10, [Ljava/lang/Object;

    invoke-static {v12, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    :goto_6
    invoke-direct {v0, v1, v10}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    cmp-long v1, v8, v4

    if-lez v1, :cond_8

    .line 919
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-array v3, v11, [Ljava/lang/Object;

    aput-object v1, v3, v10

    const v1, 0x7f120613

    .line 770
    invoke-static {v1, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v10}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_8
    const/4 v1, 0x0

    :goto_7
    const/4 v3, 0x3

    .line 920
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v1, v3, :cond_b

    .line 921
    invoke-static {v2, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v4, ""

    .line 922
    invoke-virtual {v0, v4}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    const v4, 0x7f120674

    .line 923
    invoke-virtual {v0, v4, v3, v14}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v4, "variant"

    const v5, 0x7f120689

    .line 924
    invoke-virtual {v0, v5, v3, v4}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    .line 925
    invoke-static {v3, v15}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    const v3, 0x7f120698

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1060
    :goto_8
    invoke-direct {v0, v3, v4}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_9

    :cond_9
    const/4 v4, 0x0

    .line 926
    invoke-static {v3, v15}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-array v3, v4, [Ljava/lang/Object;

    .line 770
    invoke-static {v12, v3}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_a
    :goto_9
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 928
    :cond_b
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۖᩴۚ;->ۙ(I)V

    return-void
.end method

.method public final ۙ()V
    .locals 2

    .line 1197
    iget-boolean v0, p0, Ll/ۖᩴۚ;->᩷:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "\u2026"

    const/4 v1, 0x0

    .line 1060
    invoke-direct {p0, v0, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const/4 v0, 0x1

    .line 1199
    iput-boolean v0, p0, Ll/ۖᩴۚ;->᩷:Z

    return-void
.end method

.method public final ۙ(I)V
    .locals 1

    const/4 v0, 0x3

    if-le p1, v0, :cond_0

    .line 1194
    invoke-virtual {p0}, Ll/ۖᩴۚ;->ۙ()V

    :cond_0
    return-void
.end method

.method public final ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 5

    .line 1146
    invoke-virtual {p2, p3}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    if-eqz p2, :cond_1d

    .line 1147
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v0

    if-nez v0, :cond_1d

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 1148
    :cond_0
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "instructionMode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v3, 0x13

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "itemKind"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v3, 0x12

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "matchMode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v3, 0x11

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "replaceMode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v3, 0x10

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "variant"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v3, 0xf

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "view"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v3, 0xe

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "type"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v3, 0xd

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "mode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v3, 0xc

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "kind"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v3, 0xb

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "op"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v3, 0xa

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "target"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v3, 0x9

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "scanKind"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v3, 0x8

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "nameMatchMode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_d
    const-string v0, "namePatternType"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_e
    const-string v0, "contentPatternType"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_f
    const-string v0, "addressKind"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_10
    const-string v0, "access"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_11
    const-string v0, "paddingMode"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_12
    const-string v0, "patternType"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_13
    const-string v0, "queryType"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_0

    :cond_14
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_1

    :pswitch_0
    const/4 v0, 0x1

    .line 1154
    :goto_1
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 1155
    :cond_15
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asBoolean()Z

    move-result v3

    if-eqz v3, :cond_16

    const v3, 0x7f12075a

    goto :goto_2

    :cond_16
    const v3, 0x7f12069b

    :goto_2
    new-array v4, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    .line 1155
    :cond_17
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_3
    const/16 v4, 0xdc

    .line 1156
    invoke-static {v4, v3, v1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v1

    .line 1157
    iget-object v3, v1, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 1158
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v4

    if-eqz v4, :cond_1a

    const-string v4, "replacementMode"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 1159
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "template"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    const-string v0, "literal"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_4

    :cond_18
    const v0, 0x7f1206ad

    new-array v2, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    :cond_19
    const v0, 0x7f1206ae

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_4

    .line 1164
    :cond_1a
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1b

    if-eqz v0, :cond_1b

    invoke-static {v3}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1165
    :cond_1b
    :goto_4
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p2

    if-eqz p2, :cond_1c

    const-string p2, "locator"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1c

    invoke-static {v3}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1166
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1d

    iget-boolean p2, v1, Ll/۬ᩴۚ;->᩷:Z

    invoke-direct {p0, p1, v3, p2}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    :cond_1d
    :goto_5
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x6bb287de -> :sswitch_13
        -0x637f5916 -> :sswitch_12
        -0x597986ac -> :sswitch_11
        -0x54d84a9c -> :sswitch_10
        -0x521bce58 -> :sswitch_f
        -0x489e3b4f -> :sswitch_e
        -0x37e4a0a1 -> :sswitch_d
        -0x37019143 -> :sswitch_c
        -0x3518104f -> :sswitch_b
        -0x34818e6f -> :sswitch_a
        0xde1 -> :sswitch_9
        0x323b94 -> :sswitch_8
        0x3339a3 -> :sswitch_7
        0x368f3a -> :sswitch_6
        0x373aa5 -> :sswitch_5
        0xe1d1085 -> :sswitch_4
        0x19a0e677 -> :sswitch_3
        0x24961d08 -> :sswitch_2
        0x462b6947 -> :sswitch_1
        0x5b98a351 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(ILjava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    add-int/2addr p1, v0

    .line 1052
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f12069f

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, " \u00b7 "

    .line 1052
    invoke-static {p2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    return-void
.end method

.method public final varargs ۙ(I[Ljava/lang/Object;)V
    .locals 0

    .line 770
    invoke-static {p1, p2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    .line 1060
    invoke-direct {p0, p1, p2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONArray;)V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x3

    .line 1205
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_e

    .line 1206
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v2

    .line 1207
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    .line 1060
    :goto_1
    invoke-direct {p0, v2, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto/16 :goto_7

    .line 1208
    :cond_0
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isObject()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_7

    .line 1209
    :cond_1
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v2

    invoke-static {v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "arrayName"

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1210
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const-string v5, " \u00b7 "

    if-nez v4, :cond_2

    .line 1250
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 756
    invoke-static {v2, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1250
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "["

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "arrayIndex"

    const-wide/16 v6, 0x0

    invoke-static {v2, v3, v6, v7}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    const-string v3, "]"

    .line 0
    invoke-static {v4, v6, v7, v3}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "slotVirtualAddress"

    const-string v6, "slotFileOffset"

    .line 1251
    invoke-static {v2, v4, v6}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "targetVirtualAddress"

    const-string v7, "targetFileOffset"

    .line 1252
    invoke-static {v2, v6, v7}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, " \u2192 "

    .line 1253
    invoke-static {v4, v7, v6}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v5, v4}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "targetInstructionMode"

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1253
    invoke-static {v3, v5, v2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    const-string v11, "javaName"

    const-string v12, "sourceVirtualAddress"

    const-string v6, "path"

    const-string v7, "sourceLocator"

    const-string v8, "locator"

    const-string v9, "demangledName"

    const-string v10, "name"

    .line 1215
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    const/4 v6, 0x0

    :goto_2
    const/4 v7, 0x7

    if-ge v6, v7, :cond_4

    aget-object v4, v3, v6

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1216
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    const-string v3, "hit"

    .line 1219
    invoke-static {v2, v3}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v3

    const-string v6, "kind"

    .line 756
    invoke-static {v3, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "native_symbol_name"

    .line 1221
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v8, "name"

    if-nez v7, :cond_b

    const-string v7, "native_string"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_6

    :cond_5
    const-string v6, "locator"

    .line 756
    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "resource:"

    .line 1225
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 1226
    invoke-virtual {v3}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_6

    move-object v6, v2

    goto :goto_4

    :cond_6
    move-object v6, v3

    .line 756
    :goto_4
    invoke-static {v6, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1228
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    const-string v4, "type"

    .line 756
    invoke-static {v6, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "/"

    .line 1228
    invoke-static {v4, v6, v7}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_7
    const-string v6, "appLabel"

    .line 756
    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1231
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_9

    const-string v7, "packageName"

    .line 756
    invoke-static {v2, v7}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1231
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_5

    .line 756
    :cond_8
    invoke-static {v2, v7}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1231
    :goto_5
    invoke-static {v6, v5, v4}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_9
    const-string v6, "text"

    .line 756
    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1233
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_a

    .line 756
    invoke-static {v3, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1234
    :cond_a
    invoke-static {v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5, v2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    :cond_b
    :goto_6
    const-string v2, "nativeLocation"

    .line 1240
    invoke-static {v3, v2}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v6, "demangledName"

    .line 756
    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1242
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_c

    .line 756
    invoke-static {v2, v8}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1243
    :cond_c
    invoke-static {v4}, Ll/ۜᩴۚ;->᩷(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5, v6}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "virtualAddress"

    const-string v7, "fileOffset"

    .line 1244
    invoke-static {v2, v6, v7}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1243
    invoke-static {v4, v5, v2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1060
    invoke-direct {p0, v2, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const-string v2, "snippet"

    .line 1245
    invoke-virtual {v3, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 1246
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_1

    :cond_d
    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 1236
    :cond_e
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۙ(I)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONArray;I)V
    .locals 6

    .line 1185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x3

    .line 1186
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 1187
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 1188
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-lez v3, :cond_1

    const-string v3, " \u00b7 "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1189
    :cond_1
    invoke-virtual {p1, v2}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v3

    invoke-virtual {v3}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x78

    const/4 v5, 0x1

    .line 128
    invoke-static {v4, v3, v5}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v3

    iget-object v3, v3, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 1189
    invoke-static {v3}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1191
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 876
    invoke-direct {p0, p2, v0, v1}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    .line 1192
    :cond_3
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۙ(I)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;)V
    .locals 13

    const-string v0, "patches"

    .line 932
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 933
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    const/16 v4, 0xc8

    if-gt v1, v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-wide v7, v4

    :goto_1
    if-eqz v1, :cond_4

    .line 935
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v9

    if-ge v6, v9, :cond_4

    .line 936
    invoke-static {v0, v6}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v9, "beforeHex"

    .line 937
    invoke-virtual {v1, v9}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v9

    const-string v10, "afterHex"

    invoke-virtual {v1, v10}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v9, :cond_3

    if-eqz v1, :cond_3

    .line 938
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v10

    if-nez v10, :cond_1

    goto :goto_3

    .line 942
    :cond_1
    invoke-virtual {v9}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    .line 943
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    int-to-long v10, v10

    add-long/2addr v7, v10

    .line 945
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_2

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    rem-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_2

    const-wide/32 v10, 0x20000

    cmp-long v12, v7, v10

    if-gtz v12, :cond_2

    .line 946
    invoke-virtual {v9, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    :goto_3
    const/4 v1, 0x0

    :cond_4
    if-eqz v1, :cond_5

    const v0, 0x7f12069c

    new-array v1, v3, [Ljava/lang/Object;

    .line 770
    invoke-static {v0, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1060
    invoke-direct {p0, v0, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_5
    const-string v0, "bytesPatched"

    .line 949
    invoke-static {p1, v0, v4, v5}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const p1, 0x7f1206a2

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;I)V
    .locals 5

    const-string v0, "writeText"

    .line 1025
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 1026
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1027
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v1

    .line 1028
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const p1, 0x7f120623

    new-array v0, v3, [Ljava/lang/Object;

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 876
    :goto_0
    invoke-direct {p0, p2, p1, v3}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    return-void

    :cond_0
    const/16 v2, 0xdc

    const/4 v4, 0x1

    .line 1032
    invoke-static {v2, v1, v4}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v2

    iget-object v2, v2, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1033
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v3

    const p1, 0x7f12068b

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 1037
    :cond_1
    invoke-virtual {p0, p2, p1, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Lbin/mt/json/JSONObject;)V
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "results"

    move-object/from16 v2, p2

    .line 883
    invoke-static {v2, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    invoke-static/range {p1 .. p1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v3, "adds"

    invoke-static {v2, v3}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 886
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    const/16 v6, 0xc8

    if-gt v3, v6, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide v10, v6

    :goto_1
    if-eqz v3, :cond_4

    .line 887
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v12

    if-ge v8, v12, :cond_4

    .line 888
    invoke-static {v1, v8}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v12

    const-string v13, "index"

    const-wide/16 v14, -0x1

    .line 889
    invoke-static {v12, v13, v14, v15}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v13

    cmp-long v15, v13, v6

    if-ltz v15, :cond_1

    .line 890
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v15

    int-to-long v6, v15

    cmp-long v15, v13, v6

    if-gez v15, :cond_1

    long-to-int v6, v13

    invoke-static {v2, v6}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v6

    const-string v7, "kind"

    .line 756
    invoke-static {v6, v7}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_1
    const-string v6, ""

    :goto_2
    const-string v7, "resource"

    .line 891
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_2
    const-string v7, "variant"

    .line 892
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    const/4 v3, 0x0

    :cond_3
    :goto_3
    const-string v6, "values"

    .line 893
    invoke-static {v12, v6}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v6

    invoke-virtual {v6}, Lbin/mt/json/JSONArray;->size()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v10, v6

    add-int/lit8 v8, v8, 0x1

    const-wide/16 v6, 0x0

    goto :goto_1

    :cond_4
    if-nez v3, :cond_5

    .line 896
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v5

    const v1, 0x7f1205f9

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void

    :cond_5
    if-lez v9, :cond_6

    .line 899
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v5

    const v1, 0x7f1206b9

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_6
    const-wide/16 v1, 0x0

    cmp-long v3, v10, v1

    if-lez v3, :cond_7

    .line 900
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    aput-object v1, v2, v5

    const v1, 0x7f120611

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_7
    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 4

    .line 953
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "mt_file_delete"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v2, 0x13

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "mt_file_transfer_get"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v2, 0x12

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "mt_zip_update"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v2, 0x11

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "mt_zip_extract"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v2, 0x10

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "mt_file_append_bytes"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v2, 0xf

    goto/16 :goto_0

    :sswitch_5
    const-string v0, "mt_zip_create"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v2, 0xe

    goto/16 :goto_0

    :sswitch_6
    const-string v0, "mt_file_transfer_create_download"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v2, 0xd

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "mt_file_transfer_create_upload"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v2, 0xc

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "mt_file_truncate_bytes"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v2, 0xb

    goto/16 :goto_0

    :sswitch_9
    const-string v0, "mt_apk_copy_entry"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v2, 0xa

    goto/16 :goto_0

    :sswitch_a
    const-string v0, "mt_file_append_text"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v2, 0x9

    goto/16 :goto_0

    :sswitch_b
    const-string v0, "mt_file_move"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v2, 0x8

    goto/16 :goto_0

    :sswitch_c
    const-string v0, "mt_file_copy"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_d
    const-string v0, "mt_file_replace_text"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_e
    const-string v0, "mt_file_write_bytes"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_f
    const-string v0, "mt_file_edit_text"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_10
    const-string v0, "mt_file_patch_bytes"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_11
    const-string v0, "mt_file_delete_directory"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_12
    const-string v0, "mt_file_transfer_cancel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_13
    const-string v0, "mt_file_create_directory"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    const-string v0, "completedFiles"

    const v2, 0x7f120626

    .line 963
    invoke-direct {p0, v2, p1, v0}, Ll/ۖᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "createdDirectories"

    const v2, 0x7f12061d

    .line 964
    invoke-direct {p0, v2, p1, v0}, Ll/ۖᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "deletedFiles"

    const v2, 0x7f12062b

    .line 965
    invoke-direct {p0, v2, p1, v0}, Ll/ۖᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "deletedDirectories"

    const v2, 0x7f12061e

    .line 966
    invoke-direct {p0, v2, p1, v0}, Ll/ۖᩴۚ;->᩷(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string v0, "changed"

    .line 967
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v2

    const-string v3, "stateKnown"

    if-eqz v2, :cond_14

    const p2, 0x7f1206cd

    new-array v0, v1, [Ljava/lang/Object;

    .line 770
    invoke-static {p2, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 1060
    :goto_1
    invoke-direct {p0, p2, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_3

    .line 968
    :cond_14
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {p1, v3}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_16

    const-string v0, "mt_file_transfer_"

    .line 969
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_15

    const p2, 0x7f120744

    goto :goto_2

    :cond_15
    const p2, 0x7f12069c

    :goto_2
    new-array v0, v1, [Ljava/lang/Object;

    .line 770
    invoke-static {p2, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 971
    :cond_16
    :goto_3
    invoke-static {p1, v3}, Ll/ۜᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_17

    const p1, 0x7f1206d1

    new-array p2, v1, [Ljava/lang/Object;

    .line 770
    invoke-static {p1, p2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_17
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e92354b -> :sswitch_13
        -0x691d7bdd -> :sswitch_12
        -0x46081f5c -> :sswitch_11
        -0x3fc9a0f7 -> :sswitch_10
        -0x11d77729 -> :sswitch_f
        -0xc57b6a0 -> :sswitch_e
        0xeee9523 -> :sswitch_d
        0x1708e3c0 -> :sswitch_c
        0x170d701c -> :sswitch_b
        0x1b8f0087 -> :sswitch_a
        0x2a9b1ec3 -> :sswitch_9
        0x2de3dedd -> :sswitch_8
        0x3c4740db -> :sswitch_7
        0x3f5cace2 -> :sswitch_6
        0x4991b972 -> :sswitch_5
        0x555c7051 -> :sswitch_4
        0x5d89d2cb -> :sswitch_3
        0x682c513f -> :sswitch_2
        0x73b4424d -> :sswitch_1
        0x7984d336 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V
    .locals 1

    .line 756
    invoke-static {p1, p2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1169
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    new-array p2, p1, [Ljava/lang/Object;

    .line 770
    invoke-static {p4, p2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 876
    invoke-direct {p0, p3, p2, p1}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    return-void

    .line 1170
    :cond_0
    invoke-virtual {p0, p3, p1, p2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Ll/۠ᩴۚ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "view"

    .line 756
    invoke-static {v1, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "resource_table_variants"

    .line 1359
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-wide/16 v5, 0x0

    const-string v7, " \u00b7 "

    const/4 v8, 0x3

    const-string v9, "items"

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v4, :cond_4

    .line 1339
    invoke-static {v1, v9}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 1340
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v10, [Ljava/lang/Object;

    aput-object v3, v4, v11

    const v3, 0x7f1206b0

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1060
    invoke-direct {v0, v3, v11}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1342
    :goto_0
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    if-ge v4, v9, :cond_3

    .line 1343
    invoke-static {v2, v4}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v9

    const-string v12, "packageId"

    .line 756
    invoke-static {v9, v12}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "packageName"

    invoke-static {v9, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, ":"

    .line 0
    invoke-static {v12, v14, v13}, Ll/᩵֡ۨ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 1346
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1

    .line 1347
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v12, v13

    :goto_1
    invoke-virtual {v0, v12}, Ll/ۖᩴۚ;->ۤ(Ljava/lang/String;)V

    move-object v3, v14

    :cond_1
    const-string v12, "typeName"

    .line 756
    invoke-static {v9, v12}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "variant"

    invoke-static {v9, v13}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v14, "default"

    .line 1351
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    new-array v13, v10, [Ljava/lang/Object;

    aput-object v12, v13, v11

    const v12, 0x7f1206b1

    .line 770
    invoke-static {v12, v13}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    goto :goto_2

    .line 0
    :cond_2
    invoke-static {v12, v13}, Ll/ܰۡۗ;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    :goto_2
    const-string v13, "entryCount"

    .line 1352
    invoke-static {v9, v13, v5, v6}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    new-array v13, v10, [Ljava/lang/Object;

    aput-object v9, v13, v11

    const v9, 0x7f1206b2

    .line 770
    invoke-static {v9, v13}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 1352
    invoke-static {v12, v7, v9}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1060
    invoke-direct {v0, v9, v11}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1354
    :cond_3
    invoke-virtual {v2}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۖᩴۚ;->ۙ(I)V

    .line 1355
    invoke-virtual/range {p0 .. p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void

    .line 1363
    :cond_4
    new-instance v4, Lbin/mt/json/JSONArray;

    invoke-direct {v4}, Lbin/mt/json/JSONArray;-><init>()V

    const-string v12, "hits"

    const-string v13, "refs"

    const-string v14, "listing"

    .line 1364
    filled-new-array {v9, v14, v12, v13}, [Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x0

    :goto_3
    const/4 v13, 0x4

    if-ge v12, v13, :cond_6

    aget-object v13, v9, v12

    .line 1365
    invoke-virtual {v1, v13}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v13

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Lbin/mt/json/JSONValue;->isArray()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-virtual {v13}, Lbin/mt/json/JSONValue;->asArray()Lbin/mt/json/JSONArray;

    move-result-object v4

    goto :goto_4

    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 756
    :cond_6
    :goto_4
    invoke-static {v1, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v9, "resource_table"

    .line 1367
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v9, v10, [Ljava/lang/Object;

    aput-object v3, v9, v11

    const v3, 0x7f1206bc

    .line 770
    invoke-static {v3, v9}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 1060
    :goto_5
    invoke-direct {v0, v3, v11}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_7

    .line 1368
    :cond_7
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v3

    .line 1380
    invoke-static/range {p1 .. p1}, Ll/ۖᩴۚ;->᩻(Lbin/mt/json/JSONObject;)Z

    move-result v9

    if-eqz v9, :cond_8

    const v9, 0x7f1206a1

    goto :goto_6

    :cond_8
    const v9, 0x7f120636

    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v3, v10, v11

    .line 770
    invoke-static {v9, v10}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    .line 1369
    :goto_7
    sget-object v3, Ll/۠ᩴۚ;->ܿ:Ll/۠ᩴۚ;

    if-ne v2, v3, :cond_9

    invoke-virtual {v0, v4}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;)V

    goto/16 :goto_14

    :cond_9
    const/4 v3, 0x0

    .line 1280
    :goto_8
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-ge v3, v8, :cond_18

    .line 1281
    invoke-virtual {v4, v3}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v8

    if-nez v8, :cond_a

    move-wide v15, v5

    goto/16 :goto_13

    .line 1282
    :cond_a
    invoke-virtual {v4, v3}, Lbin/mt/json/JSONArray;->get(I)Lbin/mt/json/JSONValue;

    move-result-object v8

    invoke-virtual {v8}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x2d0

    .line 1283
    invoke-static {v9, v8}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x20

    .line 1284
    invoke-virtual {v9, v10}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-gez v12, :cond_b

    const/4 v14, -0x1

    goto :goto_9

    :cond_b
    add-int/lit8 v14, v12, 0x1

    .line 1285
    invoke-virtual {v9, v10, v14}, Ljava/lang/String;->indexOf(II)I

    move-result v14

    :goto_9
    if-gez v14, :cond_c

    const/4 v10, -0x1

    goto :goto_a

    :cond_c
    add-int/lit8 v15, v14, 0x1

    .line 1286
    invoke-virtual {v9, v10, v15}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    :goto_a
    if-lez v12, :cond_17

    add-int/lit8 v15, v12, 0x1

    if-le v14, v15, :cond_17

    add-int/lit8 v13, v14, 0x1

    if-gt v10, v13, :cond_d

    goto/16 :goto_12

    .line 1291
    :cond_d
    sget-object v5, Ll/۠ᩴۚ;->᩶:Ll/۠ᩴۚ;

    if-ne v2, v5, :cond_e

    invoke-virtual {v9, v15, v14}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    goto :goto_b

    :cond_e
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 1293
    :goto_b
    :try_start_0
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    const-wide/16 v5, -0x1

    :goto_c
    add-int/lit8 v14, v10, 0x1

    .line 1294
    invoke-virtual {v9, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    .line 1296
    sget-object v15, Ll/۠ᩴۚ;->᩶:Ll/۠ᩴۚ;

    const v1, 0x7f12061f

    if-ne v2, v15, :cond_13

    .line 1297
    invoke-virtual {v9, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    goto :goto_d

    :sswitch_0
    const-string v9, "o"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_d

    :cond_f
    const/4 v13, 0x2

    goto :goto_e

    :sswitch_1
    const-string v9, "l"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto :goto_d

    :cond_10
    const/4 v13, 0x1

    goto :goto_e

    :sswitch_2
    const-string v9, "d"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto :goto_d

    :cond_11
    const/4 v13, 0x0

    goto :goto_e

    :goto_d
    const/4 v13, -0x1

    :goto_e
    packed-switch v13, :pswitch_data_0

    const-wide/16 v8, 0x0

    cmp-long v1, v5, v8

    if-ltz v1, :cond_12

    .line 1301
    invoke-static {v5, v6}, Ll/۠֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :pswitch_0
    const v1, 0x7f1206c7

    new-array v5, v11, [Ljava/lang/Object;

    .line 770
    invoke-static {v1, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :pswitch_1
    const v1, 0x7f1206ca

    new-array v5, v11, [Ljava/lang/Object;

    invoke-static {v1, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :pswitch_2
    new-array v5, v11, [Ljava/lang/Object;

    invoke-static {v1, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_f
    const-wide/16 v15, 0x0

    goto :goto_11

    :cond_12
    const v1, 0x7f120628

    new-array v5, v11, [Ljava/lang/Object;

    invoke-static {v1, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_f

    :cond_13
    const-string v12, "/"

    .line 1304
    invoke-virtual {v8, v12}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_14

    new-array v5, v11, [Ljava/lang/Object;

    .line 770
    invoke-static {v1, v5}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-wide/16 v15, 0x0

    goto :goto_10

    :cond_14
    const-wide/16 v15, 0x0

    cmp-long v1, v5, v15

    if-ltz v1, :cond_15

    .line 1305
    invoke-static {v5, v6}, Ll/۠֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_10

    :cond_15
    const-string v1, ""

    .line 1306
    :goto_10
    invoke-virtual {v9, v13, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    const-string v6, "e"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16

    const v5, 0x7f120624

    new-array v6, v11, [Ljava/lang/Object;

    .line 770
    invoke-static {v5, v6}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1306
    invoke-static {v1, v7, v5}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1308
    :cond_16
    :goto_11
    invoke-static {v14, v7, v1}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {v0, v1, v11}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_13

    :cond_17
    :goto_12
    move-wide v15, v5

    invoke-direct {v0, v9, v11}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :goto_13
    add-int/lit8 v3, v3, 0x1

    const/4 v8, 0x3

    move-object/from16 v1, p1

    move-wide v5, v15

    goto/16 :goto_8

    .line 1310
    :cond_18
    invoke-virtual {v4}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۖᩴۚ;->ۙ(I)V

    .line 1371
    :goto_14
    invoke-virtual/range {p0 .. p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_2
        0x6c -> :sswitch_1
        0x6f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۙ(Lbin/mt/json/JSONObject;Z)V
    .locals 4

    const-string v0, "textWindow"

    .line 1386
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p1

    :cond_0
    const-string v1, "returnedLineCount"

    const-wide/16 v2, 0x0

    .line 1387
    invoke-static {v0, v1, v2, v3}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const v1, 0x7f12068d

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {p0, v1, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    if-eqz p2, :cond_2

    const-string p2, "text"

    .line 1390
    invoke-virtual {v0, p2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 1391
    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object p2

    .line 1060
    invoke-direct {p0, p2, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_1
    const-string p2, "lineTruncated"

    .line 1392
    invoke-static {v0, p2}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Ll/ۖᩴۚ;->ۙ()V

    .line 1394
    :cond_2
    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public final ۙ(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1060
    invoke-direct {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۚ(Lbin/mt/json/JSONObject;)V
    .locals 2

    .line 1383
    invoke-static {p1}, Ll/ۖᩴۚ;->᩻(Lbin/mt/json/JSONObject;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f120699

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    .line 770
    invoke-static {p1, v1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method public final ۤ(Lbin/mt/json/JSONArray;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1130
    :goto_0
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    const/4 v3, 0x3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_6

    .line 1131
    invoke-static {p1, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "reason"

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, 0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "directory_unreadable"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, 0x4

    goto :goto_2

    :sswitch_1
    const-string v5, "content_search_failed"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :sswitch_2
    const-string v3, "name_match_failed"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    goto :goto_2

    :sswitch_3
    const-string v3, "metadata_unavailable"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    goto :goto_2

    :sswitch_4
    const-string v3, "file_unreadable"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    goto :goto_2

    :goto_1
    const/4 v3, -0x1

    :cond_4
    :goto_2
    packed-switch v3, :pswitch_data_0

    const/4 v3, 0x0

    goto :goto_3

    :pswitch_0
    const v3, 0x7f120754

    goto :goto_3

    :pswitch_1
    const v3, 0x7f120753

    goto :goto_3

    :pswitch_2
    const v3, 0x7f120757

    goto :goto_3

    :pswitch_3
    const v3, 0x7f120756

    goto :goto_3

    :pswitch_4
    const v3, 0x7f120755

    :goto_3
    if-eqz v3, :cond_5

    const-string v4, "count"

    const-wide/16 v7, 0x0

    .line 1140
    invoke-static {v2, v4, v7, v8}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v2, v4, v0

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1060
    invoke-direct {p0, v2, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 1142
    :cond_6
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۙ(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7e180bd4 -> :sswitch_4
        -0x4e29cc0 -> :sswitch_3
        0x4458c92b -> :sswitch_2
        0x48553d6e -> :sswitch_1
        0x558b7a9b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ۤ(Lbin/mt/json/JSONObject;)V
    .locals 8

    const-string v0, "byteWindow"

    .line 1397
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    move-object v0, p1

    :cond_0
    const-string v1, "nextByteOffset"

    const-wide/16 v2, 0x0

    .line 1398
    invoke-static {v0, v1, v2, v3}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v4

    const-string v1, "byteOffset"

    invoke-static {v0, v1, v2, v3}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    sub-long/2addr v4, v6

    .line 1399
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "totalBytes"

    invoke-static {v0, v4, v2, v3}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object v0, v2, v1

    const v0, 0x7f120609

    .line 770
    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1060
    invoke-direct {p0, v0, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    .line 1400
    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public final ۤ(Ljava/lang/String;)V
    .locals 3

    .line 1056
    iget-object v0, p0, Ll/ۖᩴۚ;->ۙ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_0

    iget v1, p0, Ll/ۖᩴۚ;->ۤ:I

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    sub-int/2addr v1, v2

    const/4 v2, 0x2

    if-le v1, v2, :cond_0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v0, 0x0

    .line 1060
    invoke-direct {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ۧ(Lbin/mt/json/JSONObject;)V
    .locals 6

    const-string v0, "startLine"

    .line 1180
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Ll/ۖᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "limit"

    invoke-static {p1, v1}, Ll/ۖᩴۚ;->ۤ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const v0, 0x7f12068c

    .line 770
    invoke-static {v0, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 1060
    invoke-direct {p0, v0, v3}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_0
    const-string v0, "startColumn"

    const-wide/16 v1, 0x0

    .line 1181
    invoke-static {p1, v0, v1, v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v3

    cmp-long v5, v3, v1

    if-eqz v5, :cond_1

    const v1, 0x7f12067f

    invoke-virtual {p0, v1, p1, v0}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final ۫(Lbin/mt/json/JSONObject;)V
    .locals 4

    const-string v0, "fields"

    .line 1315
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    const-string v1, "methods"

    invoke-static {p1, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v1

    .line 1316
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f12064f

    const/4 v3, 0x0

    .line 876
    invoke-direct {p0, v2, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    .line 1317
    invoke-virtual {v1}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f120660

    .line 876
    invoke-direct {p0, v1, v0, v3}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    .line 1318
    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public final ܳ(Lbin/mt/json/JSONObject;)V
    .locals 8

    const-string v0, "items"

    .line 1322
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    .line 1323
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v1

    .line 1380
    invoke-static {p1}, Ll/ۖᩴۚ;->᩻(Lbin/mt/json/JSONObject;)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f1206a1

    goto :goto_0

    :cond_0
    const v2, 0x7f120636

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    .line 770
    invoke-static {v2, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    invoke-direct {p0, v1, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x3

    .line 1324
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 1325
    invoke-static {v0, v1}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v2

    const-string v4, "appLabel"

    .line 756
    invoke-static {v2, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "packageName"

    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, " \u00b7 "

    .line 1326
    invoke-static {v4, v7, v6}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "versionName"

    .line 756
    invoke-static {v2, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1326
    invoke-static {v4, v7, v2}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1060
    invoke-direct {p0, v2, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 1328
    :cond_1
    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/ۖᩴۚ;->ۙ(I)V

    const-string v0, "warnings"

    .line 1329
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lbin/mt/json/JSONArray;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/json/JSONValue;

    .line 1330
    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->asObject()Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "code"

    .line 756
    invoke-static {v1, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "installed_apps_permission_denied"

    .line 1331
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const v1, 0x7f120600

    new-array v2, v5, [Ljava/lang/Object;

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1060
    :goto_3
    invoke-direct {p0, v1, v5}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    goto :goto_2

    .line 756
    :cond_3
    invoke-static {v1, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "metadata_unavailable"

    .line 1332
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "count"

    const-wide/16 v6, 0x0

    invoke-static {v1, v2, v6, v7}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v1, v2, v5

    const v1, 0x7f1205ff

    .line 770
    invoke-static {v1, v2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    .line 1334
    :cond_4
    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۚ(Lbin/mt/json/JSONObject;)V

    return-void
.end method

.method public final ᩴ(Lbin/mt/json/JSONObject;)V
    .locals 3

    const-string v0, "encoding"

    .line 1173
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_0

    const v1, 0x7f120648

    const v2, 0x7f120604

    invoke-virtual {p0, p1, v0, v1, v2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method public final ᩷(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 876
    invoke-direct {p0, p1, p2, v0}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    return-void
.end method

.method public final ᩷(Lbin/mt/json/JSONArray;)V
    .locals 7

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    .line 1264
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 1265
    invoke-static {p1, v0}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)Lbin/mt/json/JSONObject;

    move-result-object v1

    const-string v2, "value"

    .line 1266
    invoke-virtual {v1, v2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1267
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->isString()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_2

    .line 1268
    :cond_0
    invoke-virtual {v2}, Lbin/mt/json/JSONValue;->asString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "key"

    .line 756
    invoke-static {v1, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1270
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    const/4 v5, 0x1

    xor-int/2addr v4, v5

    const/16 v6, 0x258

    invoke-static {v6, v2, v4}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v2

    iget-object v4, v2, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    .line 1271
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    .line 123
    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    .line 128
    invoke-static {v6, v3, v5}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object v3

    iget-object v3, v3, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    const-string v5, ": "

    .line 1272
    invoke-static {v3, v5, v4}, Ll/ۜᩴۚ;->ۙ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1273
    :goto_1
    iget-boolean v2, v2, Ll/۬ᩴۚ;->᩷:Z

    invoke-direct {p0, v4, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const-string v2, "valueTruncated"

    .line 1274
    invoke-static {v1, v2}, Ll/ۜᩴۚ;->᩸(Lbin/mt/json/JSONObject;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ll/ۖᩴۚ;->ۙ()V

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1276
    :cond_3
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۖᩴۚ;->ۙ(I)V

    return-void
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;)V
    .locals 8

    const-string v0, "argument"

    .line 756
    invoke-static {p1, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1073
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x60

    if-le v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1074
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_5

    .line 1075
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x61

    if-lt v3, v4, :cond_1

    const/16 v4, 0x7a

    if-le v3, v4, :cond_4

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x5a

    if-le v3, v4, :cond_4

    :cond_2
    const/16 v4, 0x30

    if-lt v3, v4, :cond_3

    const/16 v4, 0x39

    if-le v3, v4, :cond_4

    :cond_3
    const/16 v4, 0x5f

    if-eq v3, v4, :cond_4

    const/16 v4, 0x2e

    if-eq v3, v4, :cond_4

    const/16 v4, 0x5b

    if-eq v3, v4, :cond_4

    const/16 v4, 0x5d

    if-eq v3, v4, :cond_4

    goto/16 :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    const-string v2, "badValueType"

    .line 756
    invoke-static {p1, v2}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "message"

    invoke-static {p1, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Missing "

    .line 1081
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    if-nez v4, :cond_e

    const-string v4, "Missing parameter: "

    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_1

    :cond_6
    const v4, 0x7f12063f

    .line 876
    invoke-direct {p0, v4, v0, v1}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    const-string v4, "string"

    .line 1086
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v6, "boolean"

    const-string v7, "number"

    if-nez v4, :cond_7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "object"

    .line 1087
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "array"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "null"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    :cond_7
    const v4, 0x7f12066a

    .line 876
    invoke-direct {p0, v4, v2, v1}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    .line 1090
    :cond_8
    invoke-static {v0}, Ll/ۙܳۚ;->ۙ(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v4, "badValue"

    .line 756
    invoke-static {p1, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1092
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-static {v4}, Ll/ۖᩴۚ;->᩸(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 1093
    :cond_a
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-string v2, "true"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "false"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    const v2, 0x7f12066b

    .line 876
    invoke-direct {p0, v2, v4, v1}, Ll/ۖᩴۚ;->ۙ(ILjava/lang/String;Z)V

    :cond_c
    const-string v2, "allowedValues"

    .line 1096
    invoke-static {p1, v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    .line 1097
    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    const v0, 0x7f12063a

    invoke-virtual {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONArray;I)V

    return-void

    :cond_d
    const-string p1, " must be between "

    .line 1100
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1101
    invoke-virtual {v3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1102
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v3, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, " and "

    .line 1103
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_f

    .line 1105
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v0, v0, 0x5

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 1106
    invoke-static {v2}, Ll/ۖᩴۚ;->᩸(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {p1}, Ll/ۖᩴۚ;->᩸(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v2, v0, v1

    aput-object p1, v0, v5

    const p1, 0x7f1205fd

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void

    :cond_e
    :goto_1
    new-array p1, v5, [Ljava/lang/Object;

    aput-object v0, p1, v1

    const v0, 0x7f120697

    .line 770
    invoke-static {v0, p1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_f
    :goto_2
    return-void
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)V
    .locals 13

    const-string v0, "mt_file_transfer_create_upload"

    .line 980
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_1

    const-string v0, "mt_file_transfer_create_download"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v3, "direction"

    .line 756
    invoke-static {p1, v3}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "state"

    invoke-static {p1, v4}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "upload"

    .line 982
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 983
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    const-string v8, "cancelled"

    const/4 v9, 0x2

    const/4 v10, -0x1

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v7, "sending"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto/16 :goto_2

    :cond_2
    const/16 v10, 0x8

    goto :goto_2

    :sswitch_1
    const-string v7, "publishing"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_2

    :cond_3
    const/4 v10, 0x7

    goto :goto_2

    :sswitch_2
    const-string v7, "cancelling"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    const/4 v10, 0x6

    goto :goto_2

    :sswitch_3
    const-string v7, "receiving"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_2

    :cond_5
    const/4 v10, 0x5

    goto :goto_2

    :sswitch_4
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_2

    :cond_6
    const/4 v10, 0x4

    goto :goto_2

    :sswitch_5
    const-string v7, "ready"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_2

    :cond_7
    const/4 v10, 0x3

    goto :goto_2

    :sswitch_6
    const-string v7, "failed"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_2

    :cond_8
    const/4 v10, 0x2

    goto :goto_2

    :sswitch_7
    const-string v7, "expired"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_2

    :cond_9
    const/4 v10, 0x1

    goto :goto_2

    :sswitch_8
    const-string v7, "completed"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_2

    :cond_a
    const/4 v10, 0x0

    :goto_2
    const-string v7, "download"

    packed-switch v10, :pswitch_data_0

    const v5, 0x7f1206d1

    goto/16 :goto_3

    :pswitch_0
    const v5, 0x7f120743

    goto/16 :goto_3

    :pswitch_1
    const v5, 0x7f120740

    goto/16 :goto_3

    :pswitch_2
    if-eqz v6, :cond_b

    const v5, 0x7f120745

    goto :goto_3

    :cond_b
    const v5, 0x7f120737

    goto :goto_3

    :pswitch_3
    const v5, 0x7f120742

    goto :goto_3

    .line 994
    :pswitch_4
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, 0x7f120739

    goto :goto_3

    :cond_c
    const v5, 0x7f120735

    goto :goto_3

    :pswitch_5
    if-eqz v0, :cond_d

    const v5, 0x7f120741

    goto :goto_3

    :cond_d
    if-eqz v6, :cond_e

    const v5, 0x7f12074a

    goto :goto_3

    :cond_e
    const v5, 0x7f12073c

    goto :goto_3

    :pswitch_6
    if-eqz v6, :cond_f

    const v5, 0x7f120749

    goto :goto_3

    :cond_f
    const v5, 0x7f12073b

    goto :goto_3

    :pswitch_7
    if-eqz v6, :cond_10

    const v5, 0x7f120748

    goto :goto_3

    :cond_10
    const v5, 0x7f12073a

    goto :goto_3

    :pswitch_8
    const-string v10, "mt_file_transfer_cancel"

    .line 989
    invoke-virtual {p2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    const v5, 0x7f120746

    goto :goto_3

    :cond_11
    if-eqz v6, :cond_12

    const v5, 0x7f120747

    goto :goto_3

    :cond_12
    const v5, 0x7f120738

    :goto_3
    new-array v6, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {v5, v6}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 1060
    invoke-direct {p0, v5, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    const-string v5, "error"

    .line 1000
    invoke-static {p1, v5}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v5

    .line 1001
    invoke-virtual {v5}, Lbin/mt/json/JSONObject;->isEmpty()Z

    move-result v6

    const-string v10, "diagnostics"

    if-nez v6, :cond_14

    const-string v6, "code"

    .line 756
    invoke-static {v5, v6}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v11, "TRANSFER_DIGEST_MISMATCH"

    .line 1002
    invoke-virtual {v6, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    const v6, 0x7f120736

    new-array v11, v2, [Ljava/lang/Object;

    .line 770
    invoke-static {v6, v11}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .line 1060
    invoke-direct {p0, v6, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    .line 1004
    invoke-static {v5, v10}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v6

    invoke-virtual {p0, v6, p2}, Ll/ۖᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)V

    goto :goto_4

    .line 1005
    :cond_13
    invoke-static {v5, p2}, Ll/ۜᩴۚ;->᩷(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 1060
    invoke-direct {p0, p2, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_14
    :goto_4
    const-string p2, "path"

    const v6, 0x7f120667

    .line 1172
    invoke-virtual {p0, v6, p1, p2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    if-eqz v0, :cond_15

    const-string p2, "transferId"

    const v6, 0x7f120685

    .line 1008
    invoke-virtual {p0, v6, p1, p2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    :cond_15
    if-nez v0, :cond_17

    const-string p2, "bytesTransferred"

    .line 1009
    invoke-virtual {p1, p2}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v0

    if-eqz v0, :cond_17

    const-string v0, "size"

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v6

    if-eqz v6, :cond_17

    .line 1010
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    const v3, 0x7f12073e

    goto :goto_5

    :cond_16
    const v3, 0x7f12073f

    :goto_5
    const-wide/16 v6, 0x0

    .line 1012
    invoke-static {p1, p2, v6, v7}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p1, v0, v6, v7}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-array v4, v9, [Ljava/lang/Object;

    aput-object p2, v4, v2

    aput-object v0, v4, v1

    .line 770
    invoke-static {v3, v4}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 1060
    invoke-direct {p0, p2, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_17
    const-string p2, "sha256"

    const v0, 0x7f12067b

    .line 1014
    invoke-virtual {p0, v0, p1, p2}, Ll/ۖᩴۚ;->ۙ(ILbin/mt/json/JSONObject;Ljava/lang/String;)V

    const-string p2, "warnings"

    .line 1015
    invoke-static {p1, p2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    if-nez p1, :cond_18

    .line 1016
    invoke-static {v5, v10}, Ll/ۜᩴۚ;->ᩴ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lbin/mt/json/JSONArray;->size()I

    move-result p1

    :cond_18
    if-lez p1, :cond_19

    .line 1017
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    aput-object p1, p2, v2

    const p1, 0x7f12074b

    .line 770
    invoke-static {p1, p2}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_19
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x539f09b5 -> :sswitch_8
        -0x4e0958db -> :sswitch_7
        -0x4c696bc3 -> :sswitch_6
        0x675d9a3 -> :sswitch_5
        0x1c682951 -> :sswitch_4
        0x29b162e0 -> :sswitch_3
        0x709d1170 -> :sswitch_2
        0x726eac73 -> :sswitch_1
        0x76033b5a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᩷(Lbin/mt/json/JSONObject;Z)V
    .locals 3

    if-eqz p2, :cond_0

    const-string v0, "destinationPath"

    goto :goto_0

    :cond_0
    const-string v0, "sourcePath"

    .line 756
    :goto_0
    invoke-static {p1, v0}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "entryPath"

    invoke-static {p1, v1}, Ll/ۙܳۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1042
    invoke-virtual {p1, v1}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1043
    invoke-virtual {p1}, Lbin/mt/json/JSONValue;->isString()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const v1, 0x7f120a7e

    .line 770
    invoke-static {v1, p1}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_1
    if-eqz p2, :cond_2

    move-object p1, v2

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v2

    :goto_2
    const/16 p2, 0xdc

    const/4 v1, 0x1

    .line 1045
    invoke-static {p2, p1, v1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p1

    .line 1046
    invoke-static {p2, v0, v1}, Ll/ۙܳۚ;->ۙ(ILjava/lang/String;Z)Ll/۬ᩴۚ;

    move-result-object p2

    .line 1048
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " \u2192 "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p2, Ll/۬ᩴۚ;->ۙ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-boolean p2, p2, Ll/۬ᩴۚ;->᩷:Z

    invoke-direct {p0, p1, p2}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩷(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1060
    invoke-direct {p0, p1, v0}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩸(Lbin/mt/json/JSONObject;)V
    .locals 3

    const-string v0, "size"

    .line 1183
    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lbin/mt/json/JSONObject;->get(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    invoke-virtual {v1}, Lbin/mt/json/JSONValue;->isNull()Z

    move-result v1

    if-nez v1, :cond_0

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2}, Ll/ۜᩴۚ;->ۙ(Lbin/mt/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const p1, 0x7f1206c6

    .line 770
    invoke-static {p1, v0}, Ll/᩶᩷ۧ;->ۙ(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 1060
    invoke-direct {p0, p1, v1}, Ll/ۖᩴۚ;->ۙ(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
